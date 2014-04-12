package com.atticuswhite.insaniquarium.entities;

import org.andengine.engine.handler.physics.PhysicsHandler;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.text.Text;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import com.atticuswhite.insaniquarium.GameFonts;

public class Food extends GameEntity {

	public Food(final float pX, final float pY, GameFonts font, final TiledTextureRegion pTextureRegion, final VertexBufferObjectManager pVertexBufferObjectManager){
		super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
		this.velocityX = 0;
		this.velocityY = 40.0f;
		this.mPhysicsHandler.setVelocity(this.velocityX, this.velocityY);
		
	}
	
	
}
