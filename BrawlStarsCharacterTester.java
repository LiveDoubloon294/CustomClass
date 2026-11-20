public class BrawlStarsCharacterTester{
   public static void main(String[] args){
      BrawlStarsCharacter shelly = new BrawlStarsCharacter();
      BrawlStarsCharacter mortis = new BrawlStarsCharacter("Mortis", "Mecha Mortis", "Mythic", 6500, 1.5, true, "Assassin", 1, false, 3);
      mortis.displayStats();
      
      mortis.buyHypercharge();
      for (int i = 0; i < 10; i++){
         mortis.levelUp();
      }
      mortis.buyHypercharge();
      
      mortis.displayStats();
   }
}