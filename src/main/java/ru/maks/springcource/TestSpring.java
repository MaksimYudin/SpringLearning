package ru.maks.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //TestBean testBean = context.getBean("testBean", TestBean.class);
        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayerOnConstructor", MusicPlayer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayerOnSetter", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
