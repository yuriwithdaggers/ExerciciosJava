class Main {
  public static void main(String[] args) {
    Lutador[] lutadores = new Lutador[5];
    lutadores[0] = new Lutador("Pretty Boy", "FR", 31, 1.75, 68.9, 11, 3, 1);
    lutadores[1] = new Lutador("Putscript", "BR", 29, 1.68, 57.8, 14, 2, 3);
    lutadores[2] = new Lutador("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
    lutadores[3] = new Lutador("Dead Code", "AU", 28, 1.93, 81.6, 13, 0, 2);
    
  Luta l1 = new Luta(lutadores[0], lutadores[3]);
  l1.lutar();
    
  }
}

