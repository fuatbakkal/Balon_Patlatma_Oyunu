package com.yazlab.proje.pencereler;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.yazlab.proje.MenuEkrani;
import com.yazlab.proje.Oyun;

/* Bölüm geçme koşulu sağlanmadığında çıkan pencere */
public class OyunBitti extends BolumSonu {

    public OyunBitti(final Stage stage, final Oyun oyun) {
        super("Oyun Bitti!");

        button("Ana Menüye Dön", new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                stage.dispose();
                oyun.setScreen(new MenuEkrani(oyun));
                return remove();
            }
        });
    }
}