package szu.vander.mvc;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * @author : Vander Choi
 * @date : 2018-09-16
 * @description : 作为发布者，一旦状态有了变化就会调用注册到这里的观察者  
 */
public class BeatModel implements BaseBeatModel, MetaEventListener {

	Sequencer sequencer;

	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();

	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

	int bpm = 90;

	Sequence sequence;

	Track track;

	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	private void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void buildTrackAndStart() {
		int[] trackList = { 35, 0, 46, 0 };

		sequence.deleteTrack(null);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return event;
	}

	private void makeTracks(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int key = list[i];

			if (key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i + 1));
			}
		}
	}

	public void on() {
		sequencer.start();
		setBPM(90);
	}

	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObserver();
	}

	public void meta(MetaMessage metaMessage) {
		if (metaMessage.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	private void beatEvent() {
		notifyBeatObservers();
	}
	
	public int getBPM() {
		return bpm;
	}

	private void notifyBPMObserver() {
		if (bpmObservers != null) {
			for (BPMObserver observer : bpmObservers) {
				observer.updateBPM();
			}
		}
	}

	private void notifyBeatObservers() {
		if (beatObservers != null) {
			for (BeatObserver observer : beatObservers) {
				observer.updateBeat();
			}
		}
	}

	public void registerObserver(BeatObserver o) {
		if (o != null) {
			beatObservers.add(o);
		}
	}

	public void registerObserver(BPMObserver o) {
		if (o != null) {
			bpmObservers.add(o);
		}
	}

	public void removeObserver(BeatObserver o) {
		if (o != null) {
			beatObservers.remove(o);
		}
	}

	public void removeObserver(BPMObserver o) {
		if (o != null) {
			bpmObservers.remove(o);
		}
	}

}
