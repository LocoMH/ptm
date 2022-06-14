package com.ptm.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class PtmGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	GridRenderer gridRenderer;
	
	int FIELDS_X = 12;
	int FIELDS_Y = 8;
	int PIXEL_PER_FIELD = 64;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("grass.png");
		
		gridRenderer = new GridRenderer(batch);
		
	}

	@Override
	public void render () {
		ScreenUtils.clear(new Color(Color.BROWN));
		batch.begin();
		
		for (int i = 0; i < FIELDS_X; i++) {
			for (int j = 0; j < FIELDS_Y; j++) {
				batch.draw(img, i * PIXEL_PER_FIELD, j * PIXEL_PER_FIELD);
			}
		}

		if (Gdx.input.isKeyPressed(Keys.NUM_1)) {
			gridRenderer.renderGrid();
		}
		
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
