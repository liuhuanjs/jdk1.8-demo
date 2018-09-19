package com.huantec.design.adapter;

/**
 * 适配器模式：两个不兼容的接口之间的桥梁。
 * 例如：音频播放器设备只能播放 mp3 文件，通过一个适配器使用更高级的音频播放器来播放 vlc 和 mp4 文件。
 *
 * @author liuhuan
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "风吹麦浪.mp3");
        audioPlayer.play("mp4", "沧海一声笑.mp4");
        audioPlayer.play("vlc", "卡路里.vlc");
        audioPlayer.play("avi", "天天向上.avi");
    }
}
