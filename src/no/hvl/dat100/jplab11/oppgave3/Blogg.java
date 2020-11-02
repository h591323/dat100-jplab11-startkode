package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg [] tab;
	private  int nesteLedige;

	public Blogg() {
		tab = new Innlegg [20];
		nesteLedige = 0;
		
	}

	public Blogg(int lengde) {
		
		tab = new Innlegg [lengde];
		nesteLedige = 0;
	
	}
	public int getAntall() {
		
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		
		return tab;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int x = -1;
		
		for (int i = 0; i<nesteLedige-1; i++) {
			if (tab[i].erLik(innlegg)) {
				x = i;
			}
		}
		
		return x;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean b = false;
		
		
			
			if (finnInnlegg(innlegg) == -1) {
			
			
			
		} else {
			b = true;
		}
		return b;
	}

	public boolean ledigPlass() {
		
		if (nesteLedige<tab.length) {
			return true;
				
			} else {
				return false;
			}
		
		
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean b = false;
		
		if (!finnes(innlegg) && ledigPlass()) {
			tab[nesteLedige] = innlegg;
			nesteLedige++;
				
			b = true;
		}
		
		
		return b;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}