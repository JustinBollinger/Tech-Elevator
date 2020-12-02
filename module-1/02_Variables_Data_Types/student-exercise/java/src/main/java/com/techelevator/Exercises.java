package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println("Example 1. 4 initial birds - 1 bird who flew away = " + remainingNumberOfBirds 
							+ " birds left on the branch.");
		System.out.println();
		
		
		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println("Example 2. 6 birds - 3 nests = " + numberOfExtraBirds + " more birds than nests.");
		System.out.println();
		
		
		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int totalNumberRaccoons = 3;
		int raccoonsHomeForDinner = 2;
		int remainingRaccoonsInWoods = totalNumberRaccoons - raccoonsHomeForDinner;
		
		System.out.println("3. 3 total raccoons - 2 raccoons who went home for dinner = " 
							+ remainingRaccoonsInWoods + " raccoon left in the woods.");
		System.out.println();
		
		
		
		/*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfExtraFlowers = numberOfFlowers - numberOfBees;
		
		System.out.println("4. 5 flowers - 3 bees = " + numberOfExtraFlowers + " less bees.");
		System.out.println();
		
		
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int firstPigeonEatingBreadcrumbs = 1;
		int newPigeonEatingBreadcrumbs = 1;
		int totalPigeonsEatingBreadcrumbs = firstPigeonEatingBreadcrumbs + newPigeonEatingBreadcrumbs;
		
		System.out.println("5. 1 initial pigeon + 1 new pigeon = " + totalPigeonsEatingBreadcrumbs 
							+ " pigeons eating breadcrumbs now.");
		System.out.println();
		
		
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int firstOwlsOnFence = 3;
		int newOwlsOnFence = 2;
		int totalOwlsOnFence = firstOwlsOnFence + newOwlsOnFence;
		
		System.out.println("6. 3 initial owls + 2 more owls = " + totalOwlsOnFence + " owls now on the fence.");
		System.out.println();
		
		
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int initialBeaversWorking = 2;
		int numberOfBeaversWentSwimming = 1;
		int workingBeaversRemaining = initialBeaversWorking - numberOfBeaversWentSwimming;
		
		System.out.println("7. 2 initial beavers - 1 beaver who went swimming = " + workingBeaversRemaining 
							+ " beaver still working.");
		System.out.println();
		
		
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		
		int initialNumberOfToucans = 2;
		int numberOfNewToucans = 1;
		int totalNumberOfToucans = initialNumberOfToucans + numberOfNewToucans;
		
		System.out.println("8. 2 initial toucans + 1 more toucan = " + totalNumberOfToucans + " toucans in all.");
		System.out.println();
		
		
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfExtraSquirrels = numberOfSquirrels - numberOfNuts;
		
		System.out.println("9. 4 squirrels - 2 nuts = " + numberOfExtraSquirrels + " more squirrels.");
		System.out.println();
		
		
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		double quarterValue = .25;
		double dimeValue = .1;
		double nickelValue = .05;
		
		int numberOfNickels = 2;
		
		double totalMoneyFound = quarterValue + dimeValue + (nickelValue * numberOfNickels);
		
		System.out.println("10. 1 quarter at .25 cents + 1 dime at .1 cents + 2 nickels at .05 cents each = " 
						+ totalMoneyFound + " cents found.");
		System.out.println();
		
		
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int totalBrierClassMuffins = 18;
		int totalMacadamsClassMuffins = 20;
		int totalFlanneryClassMuffins = 17;
		int totalFirstGradeMuffins = totalBrierClassMuffins + totalMacadamsClassMuffins + totalFlanneryClassMuffins;
		
		System.out.println("11. 18 muffins from Mrs. Brier's class + 20 muffins from Mrs. MacAdam's class "
							+ "+ 17 muffins from Mrs. Flannery's class = " + totalFirstGradeMuffins 
							+ " total muffins baked by first grade.");
		System.out.println();
		
		
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		double yoyoCost = .24;
		double whistleCost = .14;
		double twoToyTotalCost = yoyoCost + whistleCost;
		
		System.out.println("12. A yoyo for .24 cents + a whistle for .14 cents = $" + twoToyTotalCost 
							+ " spent in all for the two toys.");
		System.out.println();
		
		
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows. How many marshmallows did she use
        altogether?
        */
		int numberLargeMarshmallows = 8;
		int numberMiniMarshmallows = 10;
		int totalMarshmallows = numberLargeMarshmallows + numberMiniMarshmallows;
		
		System.out.println("13. 8 large + 10 mini = " + totalMarshmallows + " total marshmallows.");
		System.out.println();
		
		
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int hiltHouseSnowfall = 29;
		int brecknockElementarySnowfall = 17;
		int differenceOfSnow = hiltHouseSnowfall - brecknockElementarySnowfall;
		
		System.out.println("14. 29 inches - 17 inches = " + differenceOfSnow + " more inches of snow at Mrs. Hilt's house.");
		System.out.println();
		
		
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int totalMoney = 10;
		int toyTruckCost = 3;
		int pencilCaseCost = 2;
		int remainingMoney = totalMoney - toyTruckCost - pencilCaseCost;
		
		System.out.println("15. $10 total - $3 for a toy truck - $2 for a pencil case = $" + remainingMoney + " remaining.");
		System.out.println();
		
		
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int joshTotalMarbles = 16;
		int joshLostMarbles = 7;
		int joshRemainingMarbles = joshTotalMarbles - joshLostMarbles;
		
		System.out.println("16. 16 total marbles - 7 lost marbles = " + joshRemainingMarbles + " marbles left.");
		System.out.println();
		
		
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int currentNumberSeashells = 19;
		int goalNumberSeashells = 25;
		int mustFindSeashells = goalNumberSeashells - currentNumberSeashells;
		
		System.out.println("17. A goal of 25 seashells - 19 currently held seashells = " + mustFindSeashells 
							+ " seashells left to be found.");
		System.out.println();
		
		
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		
		System.out.println("18. 17 total balloons - 8 red balloons = " + greenBalloons + " green balloons.");
		System.out.println();
		
		
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int initialNumberOfBooks = 38;
		int additionalBooks = 10;
		int totalBooks = initialNumberOfBooks + additionalBooks;
		
		System.out.println("19. 38 initial books + 10 additional books = " + totalBooks + " books are on the shelf now.");
		System.out.println();
		
		
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int numberOfBeeLegs = 6;
		numberOfBeeLegs *= 8;
		
		System.out.println("20. 8 bees * 6 legs each = " + numberOfBeeLegs + " legs.");
		System.out.println();
		
		
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double iceCreamConeCost = .99;
		iceCreamConeCost *= 2;
		
		System.out.println("21. 2 ice cream cones * $0.99 each would cost $" + iceCreamConeCost + ".");
		System.out.println();
		
		
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int targetNumberOfRocks = 125;
		int rocksHave = 64;
		int rocksNeeded = targetNumberOfRocks - rocksHave;
		
		System.out.println("22. 125 total rocks - 64 rocks already had = " + rocksNeeded + " more rocks needed.");
		System.out.println();
		
		
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int hiltTotalMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltRemainingMarbles = hiltTotalMarbles - hiltLostMarbles;
		
		System.out.println("23. 38 total marbles - 15 lost marbles = " + hiltRemainingMarbles + " marbles left.");
		System.out.println();
		
		
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int totalMilesToDrive = 78;
		int totalMileageDriven = 32;
		int milesLeftToDrive = totalMilesToDrive - totalMileageDriven;
		
		System.out.println("24. 78 total miles - 32 miles driven = " + milesLeftToDrive + " miles left to drive.");
		System.out.println();
		
		
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int morningMinutesShoveling = 90;
		int afternoonMinutesShoveling = 45;
		int totalTimeSpentShoveling = morningMinutesShoveling + afternoonMinutesShoveling;
		
		System.out.println("25. 90 minutes in the morning + 45 minutes in the afternoon = " + totalTimeSpentShoveling 
							+ " total minutes shoveling.");
		System.out.println();
		
		
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		double hotDogCost = .50;
		hotDogCost *= 6;
		
		System.out.println("26. 6 hot dogs * $0.50 each = $" + hotDogCost + " total paid.");
		System.out.println();
		
		
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		double numeratorTotalFunds = .50;
		double denominatorPencilCost = .07;
		double quotientNumberOfPencils = numeratorTotalFunds / denominatorPencilCost;
		
		System.out.println("27. $0.50 total funds / $0.07 for each pencil = " + quotientNumberOfPencils + " pencils can be bought.");
		System.out.println();
		
		
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int totalNumberOfButterflies = 33;
		int numberOfOrangeButterflies = 20;
		int numberOfRedButterflies = totalNumberOfButterflies - numberOfOrangeButterflies;
		
		System.out.println("28. 33 total butterflies - 20 orange butterflies = " + numberOfRedButterflies + " red butterflies.");
		System.out.println();
		
		
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		
		double moneyGivenToClerk = 1.00;
		double candyCost = .54;
		double amountOfChangeExpected = moneyGivenToClerk - candyCost;
		
		System.out.println("29. $1.00 given - $0.54 for the cost of candy = $" + amountOfChangeExpected + " expected back.");
		System.out.println();
		
		
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int numberOfTreesInBackyard = 13;
		int numberOfTreesToBePlanted = 12;
		int totalNumberOfTrees = numberOfTreesInBackyard + numberOfTreesToBePlanted;
		
		System.out.println("30. 13 trees in the backyard + 12 more trees to be planted = " + totalNumberOfTrees + " total trees.");
		System.out.println();
		
		
		
		/*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int numberOfDays = 2;
		int numberOfHoursInOneDay = 24;
		int numberOfHoursUntilSeeGrandma = numberOfDays * numberOfHoursInOneDay;
		
		System.out.println("31. 2 days * 24 hours in each day = " + numberOfHoursUntilSeeGrandma 
							+ " hours until she sees her grandma.");
		System.out.println();
		
		
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int numberOfCousins = 4;
		int piecesOfGumToGiveEachCousin = 5;
		int totalGumRequired = numberOfCousins * piecesOfGumToGiveEachCousin;
		
		System.out.println("32. 4 cousins * 5 pieces each = " + totalGumRequired + " total pieces of gum required.");
		System.out.println();
		
		
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		double danTotalMoney = 3.00;
		double costCandyBar = 1.00;
		double danRemainingMoney = danTotalMoney - costCandyBar;
		
		System.out.println("33. $3.00 total - $1.00 for a candy bar = $" + danRemainingMoney + " left.");
		System.out.println();
		
		
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		
		int numberOfBoatsInLake = 5;
		int numberOfPeoplePerBoat = 3;
		int totalPeopleOnBoats = numberOfBoatsInLake * numberOfPeoplePerBoat;
		
		System.out.println("34. 5 boats * 3 people per boat = " + totalPeopleOnBoats + " people on boats.");
		System.out.println();
		
		
		
		/*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		
		int initialLegos = 380;
		int legosLost = 57;
		int remainingLegos = initialLegos - legosLost;
		
		System.out.println("35. 380 initial legos - 57 lost legos = " + remainingLegos + " legos remaining.");
		System.out.println();

		
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		
		int goalMuffins = 83;
		int currentMuffins = 35;
		int requiredMuffins = goalMuffins - currentMuffins;
		
		System.out.println("36. 83 muffins needed - 35 muffins have = " + requiredMuffins + " muffins left to bake.");
		System.out.println();
		
		
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int crayonsWilly = 1400;
		int crayonsLucy = 290;
		int differenceInCrayonQuantity = crayonsWilly - crayonsLucy;
		
		System.out.println("37. Willy's 1400 crayons - Lucy's 290 crayons = " + differenceInCrayonQuantity + " more crayons than Lucy.");
		System.out.println();
		
		
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int numberOfStickersOnPage = 10;
		int numberOfPages = 22;
		int totalStickers = numberOfStickersOnPage * numberOfPages;
		
		System.out.println("38. 10 stickers per page * 22 pages of stickers = " + totalStickers + " total stickers.");
		System.out.println();
		
		
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int totalCupcakes = 96;
		int totalChildren = 8;
		int cupcakesPerChild = totalCupcakes / totalChildren;
		
		System.out.println("39. 96 cupcakes / 8 children = " + cupcakesPerChild + " cupcakes per child.");
		System.out.println();
		
		
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int totalGingerbreadCookies = 47;
		int jarMaxCapacity = 6;
		int cookiesNotInJar = totalGingerbreadCookies % jarMaxCapacity;
		
		System.out.println("40. 6 cookies in each jar leaves " + cookiesNotInJar + " cookies not placed in a jar.");
		System.out.println();
		
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		
		int totalCroissants = 59;
		int totalNeighbors = 8;
		int croissantsLeftOver = totalCroissants % totalNeighbors;
		
		System.out.println("41. 59 croissants given to 8 neighbors leaves " + croissantsLeftOver + " croissants left over.");
		System.out.println();
		
		
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int totalOatmealCookies = 276;
		int cookiesPerTray = 12;
		int totalTraysNeeded = totalOatmealCookies / cookiesPerTray;
		
		System.out.println("42. 276 oatmeal cookies / 12 cookies per tray = " + totalTraysNeeded + " trays needed.");
		System.out.println();
		
		
		
        /*
        43. Marian's friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int totalPretzels = 480;
		int pretzelsPerServing = 12;
		int totalServingsPrepared = totalPretzels / pretzelsPerServing;
		
		System.out.println("43. 480 pretzels / 12 pretzels per serving = " + totalServingsPrepared + " total servings prepared.");
		System.out.println();
		
		
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		
		int totalLemonCupcakes = 53;
		int cupcakesLeftAtHome = 2;
		int cupcakesPerBox = 3;
		
		int distributableCupcakes = totalLemonCupcakes - cupcakesLeftAtHome; // 51 cupcakes
		int totalBoxesGivenAway = distributableCupcakes / cupcakesPerBox;
		
		System.out.println("44. 53 total cupcakes - 2 cupcakes left at home = " + distributableCupcakes + 
							" distributable cupcakes / 3 cupcakes per box = " + totalBoxesGivenAway + " total boxes given away.");
		System.out.println();
		
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		
		int totalCarrotSticks = 74;
		int totalPeople = 12;
		int uneatenCarrotSticks = totalCarrotSticks % totalPeople;
		
		System.out.println("45. 74 carrot sticks served equally to 12 people leaves " + uneatenCarrotSticks 
							+ " uneaten carrot sticks.");
		System.out.println();
		
		
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int totalTeddyBears = 98;
		int maxShelfCapacity = 7;
		int numberOfFilledShelves = totalTeddyBears / maxShelfCapacity;
		
		System.out.println("46. 98 total bears / 7 teddy bears on each = " + numberOfFilledShelves + " filled shelves.");
		System.out.println();
		
		
		
        /*
        47. Susie's mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		 
		int totalPictures = 480;
		int albumMaxCapacity = 20;
		int totalAlbumsRequired = totalPictures / albumMaxCapacity;
		
		System.out.println("47. 480 total pictures / 20 pictures per album = " + totalAlbumsRequired + " albums required.");
		System.out.println();
		
		
		
        /*
        48. Joe, Susie's brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int totalCards = 94;
		int maxBoxCapacity = 8;
		int totalFullBoxes = totalCards / maxBoxCapacity;
		int cardsInUnfilledBox = totalCards % maxBoxCapacity;
		
		System.out.println("48. 94 trading cards / 8 cards per box = " + totalFullBoxes + " full boxes with " 
							+ cardsInUnfilledBox + " cards in the unfilled box.");
		System.out.println();
		
		
		
        /*
        49. Susie's father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		
		int distributableBooks = 210;
		int totalShelves = 10;
		int booksPerShelf = distributableBooks / totalShelves;
		
		System.out.println("49. 210 total books / 10 shelves = " + booksPerShelf + " books on each shelf.");
		System.out.println();
		
		
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		int cristinaTotalCroissants = 17;
		int numberOfGuests = 7;
		int totalCroissantsPerGuest = cristinaTotalCroissants / numberOfGuests;
		
		System.out.println("50. 17 total croissants / 7 guests = " + totalCroissantsPerGuest + " croissants per guest.");
		System.out.println();
		
		
		
        /*
            CHALLENGE PROBLEMS - ALL BONUS vvvvvv
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Justin";
		String lastName = "Bollinger";
		String middleInitial = "J";
		String variantFullName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println("Challenge Problem 2: " + variantFullName);
        System.out.println();
		
		
		/*
        The distance between New York and Chicago is 800 miles, and the train has already traveled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
