package program;

public enum KastResult {

	// Spilleren mister alle sine point hvis spilleren slår to 1'ere.
	PointsTabt,

	// Spilleren får en ekstra tur hvis spilleren slår to ens.
	EkstraTur,

	// Spilleren kan vinde spillet ved at slå to 6'ere, hvis spilleren også i
	// forrige kast slog to 6'ere uanset om det er på ekstrakast eller i forrige
	// tur.
	SpilVundet, 
	
	FortsætSpil
}
