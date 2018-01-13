/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.io.*;
import javax.sound.sampled.*;

/**
 *
 * @author 2
 */
public class AudioPlayer implements LineListener {

    boolean playCompleted;
    Clip audioClip;

    /**
     * Play a given audio file.
     *
     * @param audioFilePath Path of the audio file. Use String to specify. put
     * the wav files in Res folder
     */
    void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);

            audioClip = (Clip) AudioSystem.getLine(info);

            audioClip.addLineListener(this);

            audioClip.open(audioStream);

            audioClip.start();

            while (!playCompleted) {
                // wait for the playback completes
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
            }

            audioClip.close();

        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }

    }

    /**
     * Listens to the START and STOP events of the audio line.
     */
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();

        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");

        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }

    }
//
//	public static void main(String[] args) {
//		String audioFilePath = "Res/Swords_Collide-Sound_Explorer-2015600826.wav";
//		AudioPlayer player = new AudioPlayer();
//		player.play(audioFilePath);
//	}
//    

}
