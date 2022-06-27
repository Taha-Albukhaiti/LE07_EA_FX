package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Konfiguration des Getraenkeautomaten. Aktuell koennen nur die Getraenkepreise hinterlegt werden.
 * Der Einfachheit halber ist die zugehoerige Instanzvariable public.
 * @author holger
 *
 */
public class Konfiguration {
	//welches Getraenk wieviel kostet, speichert diese Map
	public Map<String, Double> preisverzeichnis = new HashMap<>();

}
