/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.control.MapControl.LocationName;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class ItemControl {
    
    
        public enum Items {
        secretRayGun,
        shirt,
        videoGame, 
        leatherBag, 
        mountainDew, 
        drPepper,
        donuts,
        gas,
        ar15,
        bazooka, 
        crossbow,
        katana,
        nunchucks,
        bowstaff,
        throwingStars,
        baseballBat,
        dumbbells,
        golfClub,
        ancientBookofSpells,
        libraryCard,
        taxForms,
        holyWater,
        sacramentalWine,
        altarBoyVestments,
        usedNeedles,
        medicine,
        freshOrgans,
        textbook,
        reportCard,
        bagOfMoney,
        dyePack,
        loanApplication,
        supermanComic,
        mintYoda,
        oilCan,
        tireIron,
        nerveGas,
        armyUniform,
        abramsTank,
        bookOfStamps,
        junkMail,
        sparklers,
        m80,
        bottleRockets,
        chinchilla,
        catnip,
        cobra,
        anchor,
        canOfWorms,
        nailGun,
        chainsaw,
        axe,
        nails,
        copUniform,
        handcuffs,
        mugShot,
        giraffe,
        tRex,
        mysticalEgyptianSceptor,
        catapult,
        headstone,
        corpse,
        grievingWidow,
        bucketOfLava,
        pizza,
        pizzaCutter;
    }
    public static Item[] createInventoryList() {
        
        Item[] item = new Item[66];
        Scene[] scene = RunningErrands.getScene();
        
        Item secretRayGun = new Item();
        secretRayGun.setDescription("Secret Ray Gun");
        secretRayGun.setRequiredAmount(0);
        secretRayGun.setItemCost(0);
        secretRayGun.setItemValue(100000);
        secretRayGun.setItemQuantity(0);
        secretRayGun.setStrength(100000);
        secretRayGun.setItemNumber(0);
        secretRayGun.setItemBuyable("N");
        secretRayGun.setItemInBuyList("N");
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        secretRayGun.setItemType("Weapon");
        secretRayGun.setSceneToBuy(scene[LocationName.bankScene.ordinal()]);
        secretRayGun.setSceneToSell(scene[LocationName.gunShopScene.ordinal()]);
        item[Items.secretRayGun.ordinal()] = secretRayGun;
        
        Item shirt = new Item();
        shirt.setDescription("Shirt");
        shirt.setRequiredAmount(0);
        shirt.setItemCost(20);
        shirt.setItemValue(20);
        shirt.setItemQuantity(0);
        shirt.setStrength(10);
        shirt.setItemNumber(0);
        shirt.setItemBuyable("Y");
        shirt.setItemSellable("Y");
        shirt.setItemInSellList("N");
        shirt.setItemInBuyList("Y");
        shirt.setItemType("Nonweapon");
        shirt.setSceneToBuy(scene[LocationName.mallScene.ordinal()]);
        shirt.setSceneToSell(scene[LocationName.schoolScene.ordinal()]);
        item[Items.shirt.ordinal()] = shirt;
        
        Item videoGame = new Item();
        videoGame.setDescription("Video Game");
        videoGame.setRequiredAmount(0);
        videoGame.setItemCost(60);
        videoGame.setItemValue(60);
        videoGame.setItemQuantity(0);
        videoGame.setStrength(10);
        videoGame.setItemNumber(2);
        videoGame.setItemBuyable("Y");
        videoGame.setItemSellable("Y");
        videoGame.setItemInSellList("N");
        videoGame.setItemInBuyList("Y");
        videoGame.setItemType("Nonweapon");
        videoGame.setSceneToBuy(scene[LocationName.redBoxScene.ordinal()]);
        videoGame.setSceneToSell(scene[LocationName.comicScene.ordinal()]);
        item[Items.videoGame.ordinal()] = videoGame;
        
        Item leatherBag = new Item();
        leatherBag.setDescription("Fancy Leather Bag");
        leatherBag.setRequiredAmount(0);
        leatherBag.setItemCost(800);
        leatherBag.setItemValue(400);
        leatherBag.setItemQuantity(0);
        leatherBag.setStrength(10);
        leatherBag.setItemNumber(3);
        leatherBag.setItemBuyable("Y");
        leatherBag.setItemSellable("Y");
        leatherBag.setItemInSellList("N");
        leatherBag.setItemType("Nonweapon");
        leatherBag.setSceneToBuy(scene[LocationName.mallScene.ordinal()]);
        leatherBag.setSceneToSell(scene[LocationName.armyScene.ordinal()]);
        item[Items.leatherBag.ordinal()] = leatherBag;
        
        Item mountainDew = new Item();
        mountainDew.setDescription("Mountain Dew");
        mountainDew.setRequiredAmount(0);
        mountainDew.setItemCost(3);
        mountainDew.setItemValue(1);
        mountainDew.setItemQuantity(10);
        mountainDew.setStrength(10);
        mountainDew.setItemNumber(4);
        mountainDew.setItemBuyable("Y");
        mountainDew.setItemSellable("Y");
        mountainDew.setItemInSellList("N");
        mountainDew.setItemType("Nonweapon");
        mountainDew.setSceneToBuy(scene[LocationName.GroceryScene.ordinal()]);
        mountainDew.setSceneToSell(scene[LocationName.schoolScene.ordinal()]);
        item[Items.mountainDew.ordinal()] = mountainDew;
        
        Item drPepper = new Item();
        drPepper.setDescription("Dr. Pepper");
        drPepper.setRequiredAmount(0);
        drPepper.setItemCost(3);
        drPepper.setItemValue(1);
        drPepper.setItemQuantity(10);
        drPepper.setStrength(10);
        drPepper.setItemNumber(5);
        drPepper.setItemBuyable("Y");
        drPepper.setItemSellable("Y");
        drPepper.setItemInSellList("N");
        drPepper.setItemType("Nonweapon");
        drPepper.setSceneToBuy(scene[LocationName.GroceryScene.ordinal()]);
        drPepper.setSceneToSell(scene[LocationName.schoolScene.ordinal()]);
        item[Items.drPepper.ordinal()] = drPepper;
        
        Item donuts = new Item();
        donuts.setDescription("Donut");
        donuts.setRequiredAmount(0);
        donuts.setItemCost(4);
        donuts.setItemValue(2);
        donuts.setItemQuantity(0);
        donuts.setStrength(10);
        donuts.setItemNumber(6);
        donuts.setItemBuyable("Y");
        donuts.setItemSellable("Y");
        donuts.setItemInSellList("N");
        donuts.setItemType("Nonweapon");
        donuts.setSceneToBuy(scene[LocationName.GroceryScene.ordinal()]);
        donuts.setSceneToSell(scene[LocationName.orphanScene.ordinal()]);
        item[Items.donuts.ordinal()] = donuts;
        
        Item gas = new Item();
        gas.setDescription("Gas");
        gas.setRequiredAmount(0);
        gas.setItemCost(4);
        gas.setItemValue(4);
        gas.setItemQuantity(10);
        gas.setStrength(10);
        gas.setItemNumber(7);
        gas.setItemBuyable("Y");
        gas.setItemSellable("Y");
        gas.setItemInSellList("N");
        gas.setItemType("Nonweapon");
        gas.setSceneToBuy(scene[LocationName.gasScene.ordinal()]);
        gas.setSceneToSell(scene[LocationName.armyScene.ordinal()]);
        item[Items.gas.ordinal()] = gas;
        
        Item ar15 = new Item();
        ar15.setDescription("AR-15");
        ar15.setDescription("AR-15");
        ar15.setRequiredAmount(0);
        ar15.setItemCost(1500);
        ar15.setItemValue(750);
        ar15.setItemQuantity(0);
        ar15.setStrength(30);
        ar15.setItemNumber(8);
        ar15.setItemBuyable("Y");
        ar15.setItemSellable("Y");
        ar15.setItemInSellList("N");
        ar15.setItemType("Weapon");
        ar15.setSceneToBuy(scene[LocationName.armyScene.ordinal()]);
        ar15.setSceneToSell(scene[LocationName.gunShopScene.ordinal()]);
        item[Items.ar15.ordinal()] = ar15;
        
        Item bazooka = new Item();
        bazooka.setDescription("Bazooka");
        bazooka.setRequiredAmount(0);
        bazooka.setItemCost(5000);
        bazooka.setItemValue(2500);
        bazooka.setItemQuantity(0);
        bazooka.setStrength(1000);
        bazooka.setItemNumber(9);
        bazooka.setItemBuyable("Y");
        bazooka.setItemSellable("Y");
        bazooka.setItemInSellList("N");
        bazooka.setItemType("Weapon");
        bazooka.setSceneToBuy(scene[LocationName.armyScene.ordinal()]);
        bazooka.setSceneToSell(scene[LocationName.gunShopScene.ordinal()]);
        item[Items.bazooka.ordinal()] = bazooka;
        
        Item crossbow = new Item();
        crossbow.setDescription("Crossbow");
        crossbow.setRequiredAmount(0);
        crossbow.setItemCost(500);
        crossbow.setItemValue(250);
        crossbow.setItemQuantity(0);
        crossbow.setStrength(27);
        crossbow.setItemNumber(10);
        crossbow.setItemBuyable("Y");
        crossbow.setItemSellable("Y");
        crossbow.setItemInSellList("N");
        crossbow.setItemType("Weapon");
        crossbow.setSceneToBuy(scene[LocationName.gunShopScene.ordinal()]);
        crossbow.setSceneToSell(scene[LocationName.zooScene.ordinal()]);
        item[Items.crossbow.ordinal()] = crossbow;
        
        Item katana = new Item();
        katana.setDescription("Katana");
        katana.setRequiredAmount(0);
        katana.setItemCost(400);
        katana.setItemValue(320);
        katana.setItemQuantity(0);
        katana.setStrength(20);
        katana.setItemNumber(11);
        katana.setItemBuyable("Y");
        katana.setItemSellable("Y");
        katana.setItemInSellList("N");
        katana.setItemType("Weapon");
        katana.setSceneToBuy(scene[LocationName.gunShopScene.ordinal()]);
        katana.setSceneToSell(scene[LocationName.ninjaScene.ordinal()]);
        item[Items.katana.ordinal()] = katana;
        
        Item nunchucks = new Item();
        nunchucks.setDescription("Nunchucks");
        nunchucks.setRequiredAmount(0);
        nunchucks.setItemCost(170);
        nunchucks.setItemValue(170);
        nunchucks.setItemQuantity(0);
        nunchucks.setStrength(15);
        nunchucks.setItemNumber(12);
        nunchucks.setItemBuyable("Y");
        nunchucks.setItemSellable("Y");
        nunchucks.setItemInSellList("N");
        nunchucks.setItemType("Weapon");
        nunchucks.setSceneToBuy(scene[LocationName.orphanScene.ordinal()]);
        nunchucks.setSceneToSell(scene[LocationName.ninjaScene.ordinal()]);
        item[Items.nunchucks.ordinal()] = nunchucks;
        
        Item bowstaff = new Item();
        bowstaff.setDescription("Bow Staff");
        bowstaff.setRequiredAmount(0);
        bowstaff.setItemCost(150);
        bowstaff.setItemValue(10);
        bowstaff.setItemQuantity(0);
        bowstaff.setStrength(10);
        bowstaff.setItemNumber(13);
        bowstaff.setItemBuyable("Y");
        bowstaff.setItemSellable("Y");
        bowstaff.setItemInSellList("N");
        bowstaff.setItemType("Weapon");
        bowstaff.setSceneToBuy(scene[LocationName.startingScene.ordinal()]);
        bowstaff.setSceneToSell(scene[LocationName.volcanoScene.ordinal()]);
        item[Items.bowstaff.ordinal()] = bowstaff;
        
        Item throwingStars = new Item();
        throwingStars.setDescription("Throwing Stars");
        throwingStars.setRequiredAmount(0);
        throwingStars.setItemCost(90);
        throwingStars.setItemValue(20);
        throwingStars.setItemQuantity(0);
        throwingStars.setStrength(15);
        throwingStars.setItemNumber(14);
        throwingStars.setItemBuyable("Y");
        throwingStars.setItemSellable("Y");
        throwingStars.setItemInSellList("N");
        throwingStars.setItemType("Weapon");
        throwingStars.setSceneToBuy(scene[LocationName.ninjaScene.ordinal()]);
        throwingStars.setSceneToSell(scene[LocationName.asylumScene.ordinal()]);
        item[Items.throwingStars.ordinal()] = throwingStars;
        
        Item baseballBat = new Item();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setRequiredAmount(0);
        baseballBat.setItemCost(15);
        baseballBat.setItemValue(5);
        baseballBat.setItemQuantity(1);
        baseballBat.setStrength(10);
        baseballBat.setItemNumber(15);
        baseballBat.setItemBuyable("Y");
        baseballBat.setItemSellable("Y");
        baseballBat.setItemInSellList("N");
        baseballBat.setItemType("Weapon");
        baseballBat.setSceneToBuy(scene[LocationName.sportingScene.ordinal()]);
        baseballBat.setSceneToSell(scene[LocationName.schoolScene.ordinal()]);
        item[Items.baseballBat.ordinal()] = baseballBat;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setItemCost(20);
        dumbbells.setItemValue(10);
        dumbbells.setItemQuantity(0);
        dumbbells.setStrength(10);
        dumbbells.setItemNumber(16);
        dumbbells.setItemBuyable("Y");
        dumbbells.setItemSellable("Y");
        dumbbells.setItemInSellList("N");
        dumbbells.setItemType("Nonweapon");
        dumbbells.setSceneToBuy(scene[LocationName.sportingScene.ordinal()]);
        dumbbells.setSceneToSell(scene[LocationName.policeScene.ordinal()]);
        item[Items.dumbbells.ordinal()] = dumbbells;
        
        Item golfClub = new Item();
        golfClub.setDescription("Golf Club");
        golfClub.setRequiredAmount(0);
        golfClub.setItemCost(100);
        golfClub.setItemValue(10);
        golfClub.setItemQuantity(0);
        golfClub.setStrength(10);
        golfClub.setItemNumber(17);
        golfClub.setItemBuyable("Y");
        golfClub.setItemSellable("Y");
        golfClub.setItemInSellList("N");
        golfClub.setItemType("Weapon");
        golfClub.setSceneToBuy(scene[LocationName.sportingScene.ordinal()]);
        golfClub.setSceneToSell(scene[LocationName.accountantScene.ordinal()]);
        item[Items.golfClub.ordinal()] = golfClub;
        
        Item ancientBookofSpells = new Item();
        ancientBookofSpells.setDescription("Ancient Book of Spells");
        ancientBookofSpells.setRequiredAmount(0);
        ancientBookofSpells.setItemCost(10000);
        ancientBookofSpells.setItemValue(10);
        ancientBookofSpells.setItemQuantity(0);
        ancientBookofSpells.setStrength(75);
        ancientBookofSpells.setItemNumber(18);
        ancientBookofSpells.setItemBuyable("N");
        ancientBookofSpells.setItemSellable("Y");
        ancientBookofSpells.setItemInSellList("N");
        ancientBookofSpells.setItemType("Weapon");
        ancientBookofSpells.setSceneToBuy(scene[LocationName.museumScene.ordinal()]);
        ancientBookofSpells.setSceneToSell(scene[LocationName.libraryScene.ordinal()]);
        item[Items.ancientBookofSpells.ordinal()] = ancientBookofSpells;
        
        Item libraryCard = new Item();
        libraryCard.setDescription("Library Card");
        libraryCard.setRequiredAmount(0);
        libraryCard.setItemCost(0);
        libraryCard.setItemValue(0);
        libraryCard.setItemQuantity(1);
        libraryCard.setStrength(10);
        libraryCard.setItemNumber(19);
        libraryCard.setItemBuyable("N");
        libraryCard.setItemSellable("Y");
        libraryCard.setItemInSellList("N");
        libraryCard.setItemType("Nonweapon");
        libraryCard.setSceneToBuy(scene[LocationName.libraryScene.ordinal()]);
        libraryCard.setSceneToSell(scene[LocationName.orphanScene.ordinal()]);
        item[Items.libraryCard.ordinal()] = libraryCard;
        
        Item taxForms = new Item();
        taxForms.setDescription("Tax Forms");
        taxForms.setRequiredAmount(0);
        taxForms.setItemCost(0);
        taxForms.setItemValue(0);
        taxForms.setItemQuantity(0);
        taxForms.setStrength(10);
        taxForms.setItemNumber(20);
        taxForms.setItemBuyable("Y");
        taxForms.setItemSellable("Y");
        taxForms.setItemInSellList("N");
        taxForms.setItemType("Nonweapon");
        taxForms.setSceneToBuy(scene[LocationName.accountantScene.ordinal()]);
        taxForms.setSceneToSell(scene[LocationName.libraryScene.ordinal()]);
        item[Items.taxForms.ordinal()] = taxForms;
        
        Item holyWater = new Item();
        holyWater.setDescription("Holy Water");
        holyWater.setRequiredAmount(0);
        holyWater.setItemCost(0);
        holyWater.setItemValue(0);
        holyWater.setItemQuantity(0);
        holyWater.setStrength(-36);
        holyWater.setItemNumber(21);
        holyWater.setItemBuyable("N");
        holyWater.setItemSellable("Y");
        holyWater.setItemInSellList("N");
        holyWater.setItemType("Weapon");
        holyWater.setSceneToBuy(scene[LocationName.churchScene.ordinal()]);
        holyWater.setSceneToSell(scene[LocationName.cemeteryScene.ordinal()]);
        item[Items.holyWater.ordinal()] = holyWater;
        
        Item sacramentalWine = new Item();
        sacramentalWine.setDescription("Sacramental Wine");
        sacramentalWine.setRequiredAmount(0);
        sacramentalWine.setItemCost(10);
        sacramentalWine.setItemValue(10);
        sacramentalWine.setItemQuantity(0);
        sacramentalWine.setStrength(10);
        sacramentalWine.setItemNumber(22);
        sacramentalWine.setItemBuyable("N");
        sacramentalWine.setItemSellable("Y");
        sacramentalWine.setItemInSellList("N");
        sacramentalWine.setItemType("Nonweapon");
        sacramentalWine.setSceneToBuy(scene[LocationName.GroceryScene.ordinal()]);
        sacramentalWine.setSceneToSell(scene[LocationName.churchScene.ordinal()]);
        item[Items.sacramentalWine.ordinal()] = sacramentalWine;
        
        Item altarBoyVestments = new Item();
        altarBoyVestments.setDescription("Altar Boy Vestments");
        altarBoyVestments.setRequiredAmount(0);
        altarBoyVestments.setItemCost(130);
        altarBoyVestments.setItemValue(10);
        altarBoyVestments.setItemQuantity(0);
        altarBoyVestments.setStrength(10);
        altarBoyVestments.setItemNumber(23);
        altarBoyVestments.setItemBuyable("N");
        altarBoyVestments.setItemSellable("Y");
        altarBoyVestments.setItemInSellList("N");
        altarBoyVestments.setItemType("Nonweapon");
        altarBoyVestments.setSceneToBuy(scene[LocationName.churchScene.ordinal()]);
        altarBoyVestments.setSceneToSell(scene[LocationName.mallScene.ordinal()]);
        item[Items.altarBoyVestments.ordinal()] = altarBoyVestments;
        
        Item usedNeedles = new Item();
        usedNeedles.setDescription("Used Needles");
        usedNeedles.setRequiredAmount(0);
        usedNeedles.setItemCost(190);
        usedNeedles.setItemValue(10);
        usedNeedles.setItemQuantity(0);
        usedNeedles.setStrength(56);
        usedNeedles.setItemNumber(24);
        usedNeedles.setItemBuyable("N");
        usedNeedles.setItemSellable("Y");
        usedNeedles.setItemInSellList("N");
        usedNeedles.setItemType("Weapon");
        usedNeedles.setSceneToBuy(scene[LocationName.hospitalScene.ordinal()]);
        usedNeedles.setSceneToSell(scene[LocationName.asylumScene.ordinal()]);
        item[Items.usedNeedles.ordinal()] = usedNeedles;
        
        Item medicine = new Item();
        medicine.setDescription("Medicine");
        medicine.setRequiredAmount(0);
        medicine.setItemCost(10);
        medicine.setItemValue(5);
        medicine.setItemQuantity(0);
        medicine.setStrength(10);
        medicine.setItemNumber(25);
        medicine.setItemBuyable("Y");
        medicine.setItemSellable("Y");
        medicine.setItemInSellList("N");
        medicine.setItemType("Nonweapon");
        medicine.setSceneToBuy(scene[LocationName.hospitalScene.ordinal()]);
        medicine.setSceneToSell(scene[LocationName.policeScene.ordinal()]);
        item[Items.medicine.ordinal()] = medicine;
        
        Item freshOrgans = new Item();
        freshOrgans.setDescription("Fresh Organs");
        freshOrgans.setRequiredAmount(0);
        freshOrgans.setItemCost(7000);
        freshOrgans.setItemValue(7000);
        freshOrgans.setItemQuantity(0);
        freshOrgans.setStrength(10);
        freshOrgans.setItemNumber(26);
        freshOrgans.setItemBuyable("N");
        freshOrgans.setItemSellable("Y");
        freshOrgans.setItemInSellList("N");
        freshOrgans.setItemType("Nonweapon");
        freshOrgans.setSceneToBuy(scene[LocationName.orphanScene.ordinal()]);
        freshOrgans.setSceneToSell(scene[LocationName.hospitalScene.ordinal()]);
        item[Items.freshOrgans.ordinal()] = freshOrgans;
        
        Item textbook = new Item();
        textbook.setDescription("Textbook");
        textbook.setRequiredAmount(0);
        textbook.setItemCost(185);
        textbook.setItemValue(0);
        textbook.setItemQuantity(0);
        textbook.setStrength(10);
        textbook.setItemNumber(27);
        textbook.setItemBuyable("N");
        textbook.setItemSellable("Y");
        textbook.setItemInSellList("N");
        textbook.setItemType("Nonweapon");
        textbook.setSceneToBuy(scene[LocationName.startingScene.ordinal()]);
        textbook.setSceneToSell(scene[LocationName.schoolScene.ordinal()]);
        item[Items.textbook.ordinal()] = textbook;
        
        Item reportCard = new Item();
        reportCard.setDescription("Report Card");
        reportCard.setRequiredAmount(0);
        reportCard.setItemCost(190);
        reportCard.setItemValue(0);
        reportCard.setItemQuantity(0);
        reportCard.setStrength(10);
        reportCard.setItemNumber(28);
        reportCard.setItemBuyable("N");
        reportCard.setItemSellable("Y");
        reportCard.setItemInSellList("N");
        reportCard.setItemType("Nonweapon");
        reportCard.setSceneToBuy(scene[LocationName.schoolScene.ordinal()]);
        reportCard.setSceneToSell(scene[LocationName.postScene.ordinal()]);
        item[Items.reportCard.ordinal()] = reportCard;
        
        Item bagOfMoney = new Item();
        bagOfMoney.setDescription("Bag of Money");
        bagOfMoney.setRequiredAmount(0);
        bagOfMoney.setItemCost(9000);
        bagOfMoney.setItemValue(13000);
        bagOfMoney.setItemQuantity(0);
        bagOfMoney.setStrength(10);
        bagOfMoney.setItemNumber(29);
        bagOfMoney.setItemBuyable("N");
        bagOfMoney.setItemSellable("Y");
        bagOfMoney.setItemInSellList("Y");
        bagOfMoney.setItemType("Nonweapon");
        bagOfMoney.setSceneToBuy(scene[LocationName.repairScene.ordinal()]);
        bagOfMoney.setSceneToSell(scene[LocationName.bankScene.ordinal()]);
        item[Items.bagOfMoney.ordinal()] = bagOfMoney;
        
        Item dyePack = new Item();
        dyePack.setDescription("Dye Pack");
        dyePack.setRequiredAmount(0);
        dyePack.setItemCost(0);
        dyePack.setItemValue(0);
        dyePack.setItemQuantity(0);
        dyePack.setStrength(10);
        dyePack.setItemNumber(30);
        dyePack.setItemBuyable("N");
        dyePack.setItemSellable("Y");
        dyePack.setItemInSellList("N");
        dyePack.setItemType("Nonweapon");
        dyePack.setSceneToBuy(scene[LocationName.bankScene.ordinal()]);
        dyePack.setSceneToSell(scene[LocationName.museumScene.ordinal()]);
        item[Items.dyePack.ordinal()] = dyePack;
        
        Item loanApplication = new Item();
        loanApplication.setDescription("Loan Application");
        loanApplication.setRequiredAmount(0);
        loanApplication.setItemCost(0);
        loanApplication.setItemValue(0);
        loanApplication.setItemQuantity(0);
        loanApplication.setStrength(10);
        loanApplication.setItemNumber(31);
        loanApplication.setItemBuyable("N");
        loanApplication.setItemSellable("Y");
        loanApplication.setItemInSellList("N");
        loanApplication.setItemType("Nonweapon");
        loanApplication.setSceneToBuy(scene[LocationName.bankScene.ordinal()]);
        loanApplication.setSceneToSell(scene[LocationName.pizzaScene.ordinal()]);
        item[Items.loanApplication.ordinal()] = loanApplication;
        
        Item supermanComic = new Item();
        supermanComic.setDescription("Superman Comic");
        supermanComic.setRequiredAmount(0);
        supermanComic.setItemCost(5);
        supermanComic.setItemValue(10);
        supermanComic.setItemQuantity(0);
        supermanComic.setStrength(10);
        supermanComic.setItemNumber(32);
        supermanComic.setItemBuyable("Y");
        supermanComic.setItemSellable("Y");
        supermanComic.setItemInSellList("N");
        supermanComic.setItemType("Nonweapon");
        supermanComic.setSceneToBuy(scene[LocationName.MarinaScene.ordinal()]);
        supermanComic.setSceneToSell(scene[LocationName.comicScene.ordinal()]);
        item[Items.supermanComic.ordinal()] = supermanComic;
        
        Item mintYoda = new Item();
        mintYoda.setDescription("Yoda - Mint condition in box");
        mintYoda.setRequiredAmount(0);
        mintYoda.setItemCost(120);
        mintYoda.setItemValue(300);
        mintYoda.setItemQuantity(0);
        mintYoda.setStrength(10);
        mintYoda.setItemNumber(33);
        mintYoda.setItemBuyable("Y");
        mintYoda.setItemSellable("Y");
        mintYoda.setItemInSellList("N");
        mintYoda.setItemType("Nonweapon");
        mintYoda.setSceneToBuy(scene[LocationName.repairScene.ordinal()]);
        mintYoda.setSceneToSell(scene[LocationName.comicScene.ordinal()]);
        item[Items.mintYoda.ordinal()] = shirt;
        
        Item oilCan = new Item();
        oilCan.setDescription("Oil Can");
        oilCan.setRequiredAmount(0);
        oilCan.setItemCost(8);
        oilCan.setItemValue(4);
        oilCan.setItemQuantity(0);
        oilCan.setStrength(10);
        oilCan.setItemNumber(34);
        oilCan.setItemBuyable("Y");
        oilCan.setItemSellable("Y");
        oilCan.setItemInSellList("N");
        oilCan.setItemType("Nonweapon");
        oilCan.setSceneToBuy(scene[LocationName.gasScene.ordinal()]);
        oilCan.setSceneToSell(scene[LocationName.MarinaScene.ordinal()]);
        item[Items.oilCan.ordinal()] = oilCan;
        
        Item tireIron = new Item();
        tireIron.setDescription("Tire Iron");
        tireIron.setRequiredAmount(0);
        tireIron.setItemCost(15);
        tireIron.setItemValue(7);
        tireIron.setItemQuantity(0);
        tireIron.setStrength(16);
        tireIron.setItemNumber(35);
        tireIron.setItemBuyable("Y");
        tireIron.setItemSellable("Y");
        tireIron.setItemInSellList("N");
        tireIron.setItemType("Weapon");
        tireIron.setSceneToBuy(scene[LocationName.repairScene.ordinal()]);
        tireIron.setSceneToSell(scene[LocationName.volcanoScene.ordinal()]);
        item[Items.tireIron.ordinal()] = tireIron;
        
        Item nerveGas = new Item();
        nerveGas.setDescription("Nerve Gas");
        nerveGas.setRequiredAmount(0);
        nerveGas.setItemCost(13000);
        nerveGas.setItemValue(750);
        nerveGas.setItemQuantity(0);
        nerveGas.setStrength(45);
        nerveGas.setItemNumber(36);
        nerveGas.setItemBuyable("N");
        nerveGas.setItemSellable("Y");
        nerveGas.setItemInSellList("N");
        nerveGas.setItemType("Weapon");
        nerveGas.setSceneToBuy(scene[LocationName.startingScene.ordinal()]);
        nerveGas.setSceneToSell(scene[LocationName.asylumScene.ordinal()]);
        item[Items.nerveGas.ordinal()] = nerveGas;
        
        Item armyUniform = new Item();
        armyUniform.setDescription("Army Uniform");
        armyUniform.setRequiredAmount(0);
        armyUniform.setItemCost(80);
        armyUniform.setItemValue(30);
        armyUniform.setItemQuantity(0);
        armyUniform.setStrength(10);
        armyUniform.setItemNumber(37);
        armyUniform.setItemBuyable("N");
        armyUniform.setItemSellable("Y");
        armyUniform.setItemInSellList("N");
        armyUniform.setItemType("Nonweapon");
        armyUniform.setSceneToBuy(scene[LocationName.armyScene.ordinal()]);
        armyUniform.setSceneToSell(scene[LocationName.fireworksScene.ordinal()]);
        item[Items.armyUniform.ordinal()] = armyUniform;
        
        Item abramsTank = new Item();
        abramsTank.setDescription("Abrams Tank");
        abramsTank.setRequiredAmount(0);
        abramsTank.setItemCost(1900000);
        abramsTank.setItemValue(30000);
        abramsTank.setItemQuantity(0);
        abramsTank.setStrength(1020);
        abramsTank.setItemNumber(38);
        abramsTank.setItemBuyable("N");
        abramsTank.setItemSellable("Y");
        abramsTank.setItemInSellList("N");
        abramsTank.setItemType("Weapon");
        abramsTank.setSceneToBuy(scene[LocationName.gasScene.ordinal()]);
        abramsTank.setSceneToSell(scene[LocationName.fireworksScene.ordinal()]);
        item[Items.abramsTank.ordinal()] = abramsTank;
        
        Item bookOfStamps = new Item();
        bookOfStamps.setDescription("Book of Stamps");
        bookOfStamps.setRequiredAmount(0);
        bookOfStamps.setItemCost(12);
        bookOfStamps.setItemValue(0);
        bookOfStamps.setItemQuantity(0);
        bookOfStamps.setStrength(10);
        bookOfStamps.setItemNumber(39);
        bookOfStamps.setItemBuyable("Y");
        bookOfStamps.setItemSellable("Y");
        bookOfStamps.setItemInSellList("N");
        bookOfStamps.setItemType("Nonweapon");
        bookOfStamps.setSceneToBuy(scene[LocationName.postScene.ordinal()]);
        bookOfStamps.setSceneToSell(scene[LocationName.accountantScene.ordinal()]);
        item[Items.bookOfStamps.ordinal()] = bookOfStamps;
        
        Item junkMail = new Item();
        junkMail.setDescription("Junk Mail");
        junkMail.setRequiredAmount(0);
        junkMail.setItemCost(1);
        junkMail.setItemValue(0);
        junkMail.setItemQuantity(0);
        junkMail.setStrength(10);
        junkMail.setItemNumber(40);
        junkMail.setItemBuyable("Y");
        junkMail.setItemSellable("Y");
        junkMail.setItemInSellList("N");
        junkMail.setItemType("Nonweapon");
        junkMail.setSceneToBuy(scene[LocationName.postScene.ordinal()]);
        junkMail.setSceneToSell(scene[LocationName.mallScene.ordinal()]);
        item[Items.junkMail.ordinal()] = junkMail;
        
        Item sparklers = new Item();
        sparklers.setDescription("Sparklers");
        sparklers.setRequiredAmount(0);
        sparklers.setItemCost(8);
        sparklers.setItemValue(0);
        sparklers.setItemQuantity(0);
        sparklers.setStrength(5);
        sparklers.setItemNumber(41);
        sparklers.setItemBuyable("Y");
        sparklers.setItemSellable("Y");
        sparklers.setItemInSellList("N");
        sparklers.setItemType("Weapon");
        sparklers.setSceneToBuy(scene[LocationName.fireworksScene.ordinal()]);
        sparklers.setSceneToSell(scene[LocationName.gunShopScene.ordinal()]);
        item[Items.sparklers.ordinal()] = sparklers;
        
        Item m80 = new Item();
        m80.setDescription("M-80");
        m80.setRequiredAmount(0);
        m80.setItemCost(15);
        m80.setItemValue(0);
        m80.setItemQuantity(0);
        m80.setStrength(10);
        m80.setItemNumber(42);
        m80.setItemBuyable("Y");
        m80.setItemSellable("Y");
        m80.setItemInSellList("N");
        m80.setItemType("Weapon");
        m80.setSceneToBuy(scene[LocationName.fireworksScene.ordinal()]);
        m80.setSceneToSell(scene[LocationName.petScene.ordinal()]);
        item[Items.m80.ordinal()] = m80;
        
        Item bottleRockets = new Item();
        bottleRockets.setDescription("Bottle Rockets");
        bottleRockets.setRequiredAmount(0);
        bottleRockets.setItemCost(10);
        bottleRockets.setItemValue(0);
        bottleRockets.setItemQuantity(0);
        bottleRockets.setStrength(6);
        bottleRockets.setItemNumber(43);
        bottleRockets.setItemBuyable("Y");
        bottleRockets.setItemSellable("Y");
        bottleRockets.setItemInSellList("N");
        bottleRockets.setItemType("Weapon");
        bottleRockets.setSceneToBuy(scene[LocationName.fireworksScene.ordinal()]);
        bottleRockets.setSceneToSell(scene[LocationName.startingScene.ordinal()]);
        item[Items.bottleRockets.ordinal()] = bottleRockets;
        
        Item chinchilla = new Item();
        chinchilla.setDescription("Chinchilla");
        chinchilla.setRequiredAmount(0);
        chinchilla.setItemCost(20);
        chinchilla.setItemValue(0);
        chinchilla.setItemQuantity(0);
        chinchilla.setStrength(10);
        chinchilla.setItemNumber(44);
        chinchilla.setItemBuyable("Y");
        chinchilla.setItemSellable("Y");
        chinchilla.setItemInSellList("N");
        chinchilla.setItemType("Nonweapon");
        chinchilla.setSceneToBuy(scene[LocationName.petScene.ordinal()]);
        chinchilla.setSceneToSell(scene[LocationName.startingScene.ordinal()]);
        item[Items.chinchilla.ordinal()] = chinchilla;
        
        Item catnip = new Item();
        catnip.setDescription("Catnip");
        catnip.setRequiredAmount(0);
        catnip.setItemCost(10);
        catnip.setItemValue(0);
        catnip.setItemQuantity(0);
        catnip.setStrength(10);
        catnip.setItemNumber(45);
        catnip.setItemBuyable("Y");
        catnip.setItemSellable("Y");
        catnip.setItemInSellList("N");
        catnip.setItemType("Nonweapon");
        catnip.setSceneToBuy(scene[LocationName.petScene.ordinal()]);
        catnip.setSceneToSell(scene[LocationName.comicScene.ordinal()]);
        item[Items.catnip.ordinal()] = catnip;
        
        Item cobra = new Item();
        cobra.setDescription("Cobra");
        cobra.setRequiredAmount(0);
        cobra.setItemCost(400);
        cobra.setItemValue(120);
        cobra.setItemQuantity(0);
        cobra.setStrength(74);
        cobra.setItemNumber(46);
        cobra.setItemBuyable("Y");
        cobra.setItemSellable("Y");
        cobra.setItemInSellList("N");
        cobra.setItemType("Weapon");
        cobra.setSceneToBuy(scene[LocationName.volcanoScene.ordinal()]);
        cobra.setSceneToSell(scene[LocationName.petScene.ordinal()]);
        item[Items.cobra.ordinal()] = cobra;
        
        Item anchor = new Item();
        anchor.setDescription("Anchor");
        anchor.setRequiredAmount(0);
        anchor.setItemCost(130);
        anchor.setItemValue(0);
        anchor.setItemQuantity(0);
        anchor.setStrength(10);
        anchor.setItemNumber(47);
        anchor.setItemBuyable("Y");
        anchor.setItemSellable("Y");
        anchor.setItemInSellList("N");
        anchor.setItemType("Nonweapon");
        anchor.setSceneToBuy(scene[LocationName.cemeteryScene.ordinal()]);
        anchor.setSceneToSell(scene[LocationName.MarinaScene.ordinal()]);
        item[Items.anchor.ordinal()] = anchor;
        
        Item canOfWorms = new Item();
        canOfWorms.setDescription("Can of Worms");
        canOfWorms.setRequiredAmount(0);
        canOfWorms.setItemCost(7);
        canOfWorms.setItemValue(0);
        canOfWorms.setItemQuantity(0);
        canOfWorms.setStrength(10);
        canOfWorms.setItemNumber(48);
        canOfWorms.setItemBuyable("Y");
        canOfWorms.setItemSellable("Y");
        canOfWorms.setItemInSellList("N");
        canOfWorms.setItemType("Nonweapon");
        canOfWorms.setSceneToBuy(scene[LocationName.orphanScene.ordinal()]);
        canOfWorms.setSceneToSell(scene[LocationName.MarinaScene.ordinal()]);
        item[Items.canOfWorms.ordinal()] = canOfWorms;
        
        Item nailGun = new Item();
        nailGun.setDescription("Nail Gun");
        nailGun.setRequiredAmount(0);
        nailGun.setItemCost(125);
        nailGun.setItemValue(30);
        nailGun.setItemQuantity(0);
        nailGun.setStrength(21);
        nailGun.setItemNumber(49);
        nailGun.setItemBuyable("Y");
        nailGun.setItemSellable("Y");
        nailGun.setItemInSellList("N");
        nailGun.setItemType("Weapon");
        nailGun.setSceneToBuy(scene[LocationName.improvementScene.ordinal()]);
        nailGun.setSceneToSell(scene[LocationName.repairScene.ordinal()]);
        item[Items.nailGun.ordinal()] = nailGun;
        
        Item chainsaw = new Item();
        chainsaw.setDescription("Chainsaw");
        chainsaw.setRequiredAmount(0);
        chainsaw.setItemCost(75);
        chainsaw.setItemValue(30);
        chainsaw.setItemQuantity(0);
        chainsaw.setStrength(33);
        chainsaw.setItemNumber(50);
        chainsaw.setItemBuyable("Y");
        chainsaw.setItemSellable("Y");
        chainsaw.setItemInSellList("N");
        chainsaw.setItemType("Weapon");
        chainsaw.setSceneToBuy(scene[LocationName.improvementScene.ordinal()]);
        chainsaw.setSceneToSell(scene[LocationName.asylumScene.ordinal()]);
        item[Items.chainsaw.ordinal()] = chainsaw;
        
        Item axe = new Item();
        axe.setDescription("Axe");
        axe.setRequiredAmount(0);
        axe.setItemCost(25);
        axe.setItemValue(0);
        axe.setItemQuantity(0);
        axe.setStrength(22);
        axe.setItemNumber(51);
        axe.setItemBuyable("Y");
        axe.setItemSellable("Y");
        axe.setItemInSellList("N");
        axe.setItemType("Weapon");
        axe.setSceneToBuy(scene[LocationName.cemeteryScene.ordinal()]);
        axe.setSceneToSell(scene[LocationName.improvementScene.ordinal()]);
        item[Items.axe.ordinal()] = axe;
        
        Item nails = new Item();
        nails.setDescription("Nails");
        nails.setRequiredAmount(0);
        nails.setItemCost(5);
        nails.setItemValue(0);
        nails.setItemQuantity(0);
        nails.setStrength(10);
        nails.setItemNumber(52);
        nails.setItemBuyable("Y");
        nails.setItemSellable("Y");
        nails.setItemInSellList("N");
        nails.setItemType("Nonweapon");
        nails.setSceneToBuy(scene[LocationName.improvementScene.ordinal()]);
        nails.setSceneToSell(scene[LocationName.cemeteryScene.ordinal()]);
        item[Items.nails.ordinal()] = nails;
        
        Item copUniform = new Item();
        copUniform.setDescription("Cop Uniform");
        copUniform.setRequiredAmount(0);
        copUniform.setItemCost(80);
        copUniform.setItemValue(20);
        copUniform.setItemQuantity(0);
        copUniform.setStrength(10);
        copUniform.setItemNumber(53);
        copUniform.setItemBuyable("N");
        copUniform.setItemSellable("Y");
        copUniform.setItemInSellList("N");
        copUniform.setItemType("Nonweapon");
        copUniform.setSceneToBuy(scene[LocationName.policeScene.ordinal()]);
        copUniform.setSceneToSell(scene[LocationName.gunShopScene.ordinal()]);
        item[Items.copUniform.ordinal()] = copUniform;
        
        Item handcuffs = new Item();
        handcuffs.setDescription("Handcuffs");
        handcuffs.setRequiredAmount(0);
        handcuffs.setItemCost(20);
        handcuffs.setItemValue(0);
        handcuffs.setItemQuantity(0);
        handcuffs.setStrength(10);
        handcuffs.setItemNumber(54);
        handcuffs.setItemBuyable("N");
        handcuffs.setItemSellable("Y");
        handcuffs.setItemInSellList("N");
        handcuffs.setItemType("Nonweapon");
        handcuffs.setSceneToBuy(scene[LocationName.policeScene.ordinal()]);
        handcuffs.setSceneToSell(scene[LocationName.churchScene.ordinal()]);
        item[Items.handcuffs.ordinal()] = handcuffs;
        
        Item mugShot = new Item();
        mugShot.setDescription("Mug Shot");
        mugShot.setRequiredAmount(0);
        mugShot.setItemCost(0);
        mugShot.setItemValue(0);
        mugShot.setItemQuantity(0);
        mugShot.setStrength(10);
        mugShot.setItemNumber(55);
        mugShot.setItemBuyable("N");
        mugShot.setItemSellable("Y");
        mugShot.setItemInSellList("N");
        mugShot.setItemType("Nonweapon");
        mugShot.setSceneToBuy(scene[LocationName.policeScene.ordinal()]);
        mugShot.setSceneToSell(scene[LocationName.postScene.ordinal()]);
        item[Items.mugShot.ordinal()] = mugShot;
        
        Item giraffe = new Item();
        giraffe.setDescription("Giraffe");
        giraffe.setRequiredAmount(0);
        giraffe.setItemCost(0);
        giraffe.setItemValue(0);
        giraffe.setItemQuantity(0);
        giraffe.setStrength(10);
        giraffe.setItemNumber(56);
        giraffe.setItemBuyable("N");
        giraffe.setItemSellable("Y");
        giraffe.setItemInSellList("N");
        giraffe.setItemType("Nonweapon");
        giraffe.setSceneToBuy(scene[LocationName.petScene.ordinal()]);
        giraffe.setSceneToSell(scene[LocationName.volcanoScene.ordinal()]);
        item[Items.giraffe.ordinal()] = giraffe;
        
        Item tRex = new Item();
        tRex.setDescription("Tyranosaurus Rex");
        tRex.setRequiredAmount(0);
        tRex.setItemCost(0);
        tRex.setItemValue(0);
        tRex.setItemQuantity(0);
        tRex.setStrength(900);
        tRex.setItemNumber(57);
        tRex.setItemBuyable("N");
        tRex.setItemSellable("Y");
        tRex.setItemInSellList("N");
        tRex.setItemType("Weapon");
        tRex.setSceneToBuy(scene[LocationName.volcanoScene.ordinal()]);
        tRex.setSceneToSell(scene[LocationName.museumScene.ordinal()]);
        item[Items.tRex.ordinal()] = tRex;
        
        Item mysticalEgyptianSceptor = new Item();
        mysticalEgyptianSceptor.setDescription("Egyption Sceptor");
        mysticalEgyptianSceptor.setRequiredAmount(0);
        mysticalEgyptianSceptor.setItemCost(0);
        mysticalEgyptianSceptor.setItemValue(0);
        mysticalEgyptianSceptor.setItemQuantity(0);
        mysticalEgyptianSceptor.setStrength(10);
        mysticalEgyptianSceptor.setItemNumber(58);
        mysticalEgyptianSceptor.setItemBuyable("N");
        mysticalEgyptianSceptor.setItemSellable("Y");
        mysticalEgyptianSceptor.setItemInSellList("N");
        mysticalEgyptianSceptor.setItemType("Nonweapon");
        mysticalEgyptianSceptor.setSceneToBuy(scene[LocationName.asylumScene.ordinal()]);
        mysticalEgyptianSceptor.setSceneToSell(scene[LocationName.museumScene.ordinal()]);
        item[Items.mysticalEgyptianSceptor.ordinal()] = mysticalEgyptianSceptor;
        
        Item catapult = new Item();
        catapult.setDescription("Catapult");
        catapult.setRequiredAmount(0);
        catapult.setItemCost(6000);
        catapult.setItemValue(200);
        catapult.setItemQuantity(0);
        catapult.setStrength(100);
        catapult.setItemNumber(59);
        catapult.setItemBuyable("N");
        catapult.setItemSellable("Y");
        catapult.setItemInSellList("N");
        catapult.setItemType("Weapon");
        catapult.setSceneToBuy(scene[LocationName.mallScene.ordinal()]);
        catapult.setSceneToSell(scene[LocationName.orphanScene.ordinal()]);
        item[Items.catapult.ordinal()] = catapult;
        
        Item headstone = new Item();
        headstone.setDescription("Headstone");
        headstone.setRequiredAmount(0);
        headstone.setItemCost(0);
        headstone.setItemValue(0);
        headstone.setItemQuantity(0);
        headstone.setStrength(10);
        headstone.setItemNumber(60);
        headstone.setItemBuyable("N");
        headstone.setItemSellable("Y");
        headstone.setItemInSellList("N");
        headstone.setItemType("Nonweapon");
        headstone.setSceneToBuy(scene[LocationName.volcanoScene.ordinal()]);
        headstone.setSceneToSell(scene[LocationName.cemeteryScene.ordinal()]);
        item[Items.headstone.ordinal()] = headstone;
        
        Item corpse = new Item();
        corpse.setDescription("Corpse");
        corpse.setRequiredAmount(0);
        corpse.setItemCost(0);
        corpse.setItemValue(0);
        corpse.setItemQuantity(0);
        corpse.setStrength(10);
        corpse.setItemNumber(61);
        corpse.setItemBuyable("Y");
        corpse.setItemSellable("Y");
        corpse.setItemInSellList("N");
        corpse.setItemType("Nonweapon");
        corpse.setSceneToBuy(scene[LocationName.cemeteryScene.ordinal()]);
        corpse.setSceneToSell(scene[LocationName.hospitalScene.ordinal()]);
        item[Items.corpse.ordinal()] = shirt;
        
        Item grievingWidow = new Item();
        grievingWidow.setDescription("Grieving Widow");
        grievingWidow.setRequiredAmount(0);
        grievingWidow.setItemCost(0);
        grievingWidow.setItemValue(0);
        grievingWidow.setItemQuantity(0);
        grievingWidow.setStrength(10);
        grievingWidow.setItemNumber(62);
        grievingWidow.setItemBuyable("N");
        grievingWidow.setItemSellable("Y");
        grievingWidow.setItemInSellList("N");
        grievingWidow.setItemType("Nonweapon");
        grievingWidow.setSceneToBuy(scene[LocationName.volcanoScene.ordinal()]);
        grievingWidow.setSceneToSell(scene[LocationName.cemeteryScene.ordinal()]);
        item[Items.grievingWidow.ordinal()] = grievingWidow;
        
        Item bucketOfLava = new Item();
        bucketOfLava.setDescription("Bucket of Lava");
        bucketOfLava.setRequiredAmount(0);
        bucketOfLava.setItemCost(0);
        bucketOfLava.setItemValue(0);
        bucketOfLava.setItemQuantity(0);
        bucketOfLava.setStrength(10);
        bucketOfLava.setItemNumber(63);
        bucketOfLava.setItemBuyable("N");
        bucketOfLava.setItemSellable("Y");
        bucketOfLava.setItemInSellList("N");
        bucketOfLava.setItemInBuyList("N");
        bucketOfLava.setItemType("Nonweapon");
        bucketOfLava.setSceneToBuy(scene[LocationName.volcanoScene.ordinal()]);
        bucketOfLava.setSceneToSell(scene[LocationName.museumScene.ordinal()]);
        item[Items.bucketOfLava.ordinal()] = bucketOfLava;
        
        Item pizza = new Item();
        pizza.setDescription("Pizza");
        pizza.setRequiredAmount(0);
        pizza.setItemCost(28);
        pizza.setItemValue(0);
        pizza.setItemQuantity(0);
        pizza.setStrength(10);
        pizza.setItemNumber(64);
        pizza.setItemBuyable("Y");
        pizza.setItemSellable("Y");
        pizza.setItemInSellList("N");
        pizza.setItemInBuyList("N");
        pizza.setItemType("Nonweapon");
        pizza.setSceneToBuy(scene[LocationName.pizzaScene.ordinal()]);
        pizza.setSceneToSell(scene[LocationName.gasScene.ordinal()]);
        item[Items.pizza.ordinal()] = pizza;
        
        Item pizzaCutter = new Item();
        pizzaCutter.setDescription("Pizza Cutter");
        pizzaCutter.setRequiredAmount(0);
        pizzaCutter.setItemCost(10);
        pizzaCutter.setItemValue(0);
        pizzaCutter.setItemQuantity(0);
        pizzaCutter.setStrength(17);
        pizzaCutter.setItemNumber(65);
        pizzaCutter.setItemBuyable("Y");
        pizzaCutter.setItemSellable("Y");
        pizzaCutter.setItemInSellList("N");
        pizzaCutter.setItemInBuyList("N");
        pizzaCutter.setItemType("Weapon");
        pizzaCutter.setSceneToBuy(scene[LocationName.GroceryScene.ordinal()]);
        pizzaCutter.setSceneToSell(scene[LocationName.pizzaScene.ordinal()]);
        item[Items.pizzaCutter.ordinal()] = pizzaCutter;
        RunningErrands.setItems(item);
        return item;
    }
    
    public static int buyItem (Item currentItem, int itemQuantity) {
        
        Persona persona = RunningErrands.getPersona();
        int currentOnHand = currentItem.getItemQuantity();
        int newOnHand = currentOnHand + itemQuantity;
        currentItem.setItemQuantity(newOnHand);
        int itemCost = currentItem.getItemCost();
        int totalSalePrice = -itemCost * itemQuantity;
        int updatedBalance = PersonaControl.updatePersonaMoney(totalSalePrice);
        return totalSalePrice;

    }
        
    public static int sellItem (Item currentItem, int itemQuantity) {
        
        Persona persona = RunningErrands.getPersona();
        int currentOnHand = currentItem.getItemQuantity();
        int newOnHand = currentOnHand - itemQuantity;
        currentItem.setItemQuantity(newOnHand);
        int itemValue = currentItem.getItemValue();
        int totalSalePrice = itemValue * itemQuantity;
        int updatedBalance = PersonaControl.updatePersonaMoney(totalSalePrice);
        return totalSalePrice;

    }
    
    public static int receiveItem (Item currentItem, int itemQuantity) {
        
        int currentOnHand = currentItem.getItemQuantity();
        int newOnHand = currentOnHand + itemQuantity;
        currentItem.setItemQuantity(newOnHand);
        return newOnHand;

    }
        
    public static int fulfillObjective (Item currentItem, int itemQuantity) {
        
        Persona persona = RunningErrands.getPersona();
        int currentOnHand = currentItem.getItemQuantity();
        int newOnHand = currentOnHand - itemQuantity;
        currentItem.setItemQuantity(newOnHand);
        return newOnHand;

    }
    

}