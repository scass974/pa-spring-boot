package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.domain.TopTen;

@Service

public class TopTenService {
	
	private ArrayList<TopTen> soundtrackTopTens;
	private ArrayList<TopTen> albumTopTens;
	
	public ArrayList<TopTen> getSoundtrackTopTens() {
		this.soundtrackTopTens = new ArrayList<TopTen>();
		
		this.soundtrackTopTens.add(new TopTen("Victory", "", "Victory.png"));
		this.soundtrackTopTens.add(new TopTen("StarSky", "", "StarSky.png"));
		this.soundtrackTopTens.add(new TopTen("NorweiganPirate", "", "NorweiganPirate.png"));
		this.soundtrackTopTens.add(new TopTen("Unbreakable", "", "Unbreakable.png"));
		this.soundtrackTopTens.add(new TopTen("Impossible", "", "Impossible.png"));
		this.soundtrackTopTens.add(new TopTen("Blackheart", "", "Blackheart.png"));
		this.soundtrackTopTens.add(new TopTen("ForTheWin", "", "ForTheWin.png"));
		this.soundtrackTopTens.add(new TopTen("HeartOfCourage", "", "HeartOfCourage.png"));
		this.soundtrackTopTens.add(new TopTen("DragonRider", "", "DragonRider.png"));
		this.soundtrackTopTens.add(new TopTen("ElDorado", "", "ElDorado.png"));
		return this.soundtrackTopTens;
	}
	
	public ArrayList<TopTen> getAlbumTopTens() {
		this.albumTopTens = new ArrayList<TopTen>();

		this.albumTopTens.add(new TopTen("Dragon", "", "Dragon.png"));
		this.albumTopTens.add(new TopTen("Unleashed", "", "Unleashed.png"));
		this.albumTopTens.add(new TopTen("Invincible", "", "Invincible.png"));
		this.albumTopTens.add(new TopTen("BattleCry", "", "BattleCry.png"));
		this.albumTopTens.add(new TopTen("SkyWorld", "", "SkyWorld.png"));
		this.albumTopTens.add(new TopTen("Archangel", "", "Archangel.png"));
		this.albumTopTens.add(new TopTen("Illusions", "", "Illusions.png"));
		this.albumTopTens.add(new TopTen("Miracles", "", "Miracles.png"));
		this.albumTopTens.add(new TopTen("Vanquish", "", "Vanquish.png"));
		this.albumTopTens.add(new TopTen("Solaris", "", "Solaris.png"));
		
		return this.albumTopTens;
	}

}