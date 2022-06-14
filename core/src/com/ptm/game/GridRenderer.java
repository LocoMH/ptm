package com.ptm.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

import space.earlygrey.shapedrawer.ShapeDrawer;

public class GridRenderer {

	ShapeDrawer lineDrawer;
	TextureRegion lineTextureRegion;

	int FIELDS_X = 12;
	int FIELDS_Y = 8;
	int PIXEL_PER_FIELD = 64;
	
	public GridRenderer(Batch batch) {
		lineTextureRegion = new TextureRegion(new Texture("line.png"));
		lineDrawer = new ShapeDrawer(batch, lineTextureRegion);
		lineDrawer.setColor(new Color(0, 0, 0, .5f));
	}
	
	public void renderGrid() {
		for (int i = 0; i <= FIELDS_X; i++) {
			lineDrawer.line(i * PIXEL_PER_FIELD, 0, i * PIXEL_PER_FIELD, PIXEL_PER_FIELD * FIELDS_Y);
		}
		for (int j = 0; j <= FIELDS_Y; j++) {
			lineDrawer.line(0, j * PIXEL_PER_FIELD, PIXEL_PER_FIELD * FIELDS_X, j * PIXEL_PER_FIELD);
		}
	}
    
}
