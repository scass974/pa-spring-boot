package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.controller.TopTenController;
import uk.ac.belfastmet.topten.domain.TopTen;

@Service

public class TopTenService {
	
	private ArrayList<TopTen> soundtrackTopTens;
	private ArrayList<TopTen> albumTopTens;
	
	Logger topTenLogger = LoggerFactory.getLogger(TopTenController.class);
	
	public ArrayList<TopTen> getSoundtrackTopTens() {
		this.soundtrackTopTens = new ArrayList<TopTen>();
		
		this.soundtrackTopTens.add(new TopTen("Victory", "Epic Music", "Victory.jpg"));
		this.soundtrackTopTens.add(new TopTen("StarSky", "Epic Music", "StarSky.jpg"));
		this.soundtrackTopTens.add(new TopTen("NorweiganPirate", "Epic Music", "NorweiganPirate.jpg"));
		this.soundtrackTopTens.add(new TopTen("Unbreakable", "Epic Music", "Unbreakable.jpg"));
		this.soundtrackTopTens.add(new TopTen("Impossible", "Epic Music", "Impossible.jpg"));
		this.soundtrackTopTens.add(new TopTen("Blackheart", "Epic Music", "Blackheart.jpg"));
		this.soundtrackTopTens.add(new TopTen("ForTheWin", "Epic Music", "ForTheWin.jpg"));
		this.soundtrackTopTens.add(new TopTen("HeartOfCourage", "Epic Music", "HeartOfCourage.jpg"));
		this.soundtrackTopTens.add(new TopTen("DragonRider", "Epic Music", "DragonRider.jpg"));
		this.soundtrackTopTens.add(new TopTen("ElDorado", "Epic Music", "ElDorado.jpg"));
		topTenLogger.info("Populated soundtrack list with: " + this.soundtrackTopTens.toString());
		return this.soundtrackTopTens;
	}
	
	public ArrayList<TopTen> getAlbumTopTens() {
		this.albumTopTens = new ArrayList<TopTen>();

		this.albumTopTens.add(new TopTen("Dragon", "Epic Music", "Dragon.jpg"));
		this.albumTopTens.add(new TopTen("Unleashed", "Epic Music", "Unleashed.jpg"));
		this.albumTopTens.add(new TopTen("Invincible", "Epic Music", "Invincible.jpg"));
		this.albumTopTens.add(new TopTen("Battlecry", "Epic Music", "Battlecry.jpg"));
		this.albumTopTens.add(new TopTen("SkyWorld", "Epic Music", "SkyWorld.jpg"));
		this.albumTopTens.add(new TopTen("Archangel", "Epic Music", "Archangel.jpg"));
		this.albumTopTens.add(new TopTen("Illusions", "Epic Music", "Illusions.jpg"));
		this.albumTopTens.add(new TopTen("Miracles", "Epic Music", "Miracles.jpg"));
		this.albumTopTens.add(new TopTen("Vanquish", "Epic Music", "Vanquish.jpg"));
		this.albumTopTens.add(new TopTen("Solaris", "Epic Music", "Solaris.jpg"));
		topTenLogger.info("Populated album list with: " + this.albumTopTens.toString());
		return this.albumTopTens;
	}

}