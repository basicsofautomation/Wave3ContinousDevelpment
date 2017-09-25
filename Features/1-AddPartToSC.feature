# Add parts to shopping cart feature 
# Covers various methods to navigate to shopping cart (Manual, VIN) 
# with different navigation mode setting Graphical Or List
# And add parts to shopping cart (Single, Multiple)
# Using plus button, Enter Key, Space bar
# Three methods to add part to shopping cart (Plus Button, Enter Key, Space Bar)
# will be tested with only one method and mode of navigation
# for all other only one method to add part to shopping cart will be used
# REM: Manual Part Addition from shopping cart is covered in Shopping Cart Features

Feature: Add Parts To Shopping Cart

# Scenario-1: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button
@NoExecute
Scenario Outline: Graphical Mode Manual Navigation Using TTN to Add Parts to Shopping Cart
Given SC1 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home Via TTN
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Trucks"|"C&E"|"10723 - CVR LHD 96 - 00"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-07 - CLUTCH BOOSTER; MINIPACK"|"1-31824-159-0"|
|"Passenger Vehicle"|"SUV"|"50919 - TBR (GM-INDONESIA) 02 -"|"3 - BRAKE,BRAKES SYSTEM"|"3-30 - BRAKE MASTER CYLINDER"|"8-94478-836-1"|
|"Buses"|"LR"|"10708 - LR 96 - 98"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-65 - STARTER"|"1-81121-064-0"|

# Scenario-2: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Enter Key
@WIP 
Scenario Outline: Graphical Mode Manual Navigation Using TTN to Add Parts to Shopping Cart
Given SC2 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home Via TTN
And Add Parts to Shopping Cart Using Enter Key
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Industrial Engine"|"2-cylinder"|"50345 - 2KC1 93 - 97"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-01 - CLUTCH"|"8-97026-582-0"|
|"Marine Engine"|"2-cylinder"|"51057 - UM2AB1 71 - 91"|"9 - TOOLS"|"9-50 - BILGE PUMP AND KINGSTONE COCK"|"5-26230-018-0"|
|"Component"|"Component"|"11461 - 6HK1 COMPO(MALAYSIA) 12 -"|"8 - CHASSIS ELECTRICAL,HEATING,AIR CONDITIONING,WIPERS,RADIO"|"8-10 - WIRING HARNESS AND FUSE"|"8-97610-213-4"|

# Scenario-3: Graphical Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Space Bar
@NoExecute
Scenario Outline: Graphical Mode Manual Navigation Using TTN to Add Parts to Shopping Cart
Given SC3 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home Via TTN
And Add Parts to Shopping Cart Using Space Bar
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Passenger Vehicle"|"PICK UP"|"50520 - KB 87 - 88"|"3 - BRAKE,BRAKES SYSTEM"|"3-30 - BRAKE MASTER CYLINDER"|"8-94136-672-0"|
|"Trucks"|"F&G"|"11507 - FRR RHD EURO2/4 SPACECAB 13 -"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-07 - CLUTCH BOOSTER; MINIPACK"|"1-31829-504-0"|
|"Trucks"|"Q"|"51353 - QKR-RHD 11 -"|"8 - CHASSIS ELECTRICAL,HEATING,AIR CONDITIONING,WIPERS,RADIO"|"8-45 - HEATER PIPING"|"8-97205-283-0"|

# Scenario-4: Graphical Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Enter Key
@WIP
Scenario Outline: Graphical Mode Manual Navigation to Add Parts to Shopping Cart
Given SC4 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home
And Add Parts to Shopping Cart Using Enter Key
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Buses"|"LT, LV"|"10794 - LT(TAIWAN) 98 - 06"|"6 - EXTERIOR BODY,GLASS MOUNTING,DOOR TRIM,MOLDING"|"6-90 - REAR BUMPER"|"1-53485-049-2"|
|"Industrial Engine"|"10-cylinder"|"10770 - 10PB1 79 -"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-66 - GENERATOR"|"1-81229-172-0"|
|"Marine Engine"|"3-cylinder"|"50850 - UM3KC1 85 -"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-93 - TROLLING VALVE"|"8-94414-940-0"|

# Scenario-5: List Mode Manual Navigation Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button
@NoExecute
Scenario Outline: List Mode Manual Navigation Using TTN to Add Parts to Shopping Cart
Given SC5 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is List
When User Manually List Navigate To SBS From Home Via TTN
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Component"|"Component"|"51546 - COMPOPARTS FOR INDIA 12 -"|"4 - PROPELLER SHAFT,AXLES,STEERING,SUSPENSION"|"4-01 - PROPELLER SHAFT"|"8-98020-789-1"|
|"Trucks"|"N"|"50785 - NHR(MALAYSIA) 97 -"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-32 - WATER PIPING; ENGINE"|"8-97043-743-1"|
|"Passenger Vehicle"|"SUV"|"51617 - UCR/S JIANGXI 15 -"|"6 - EXTERIOR BODY,GLASS MOUNTING,DOOR TRIM,MOLDING"|"6-66 - HEAD LINING AND TRIM"|"8-98190-079-2"|

# Scenario-6: List Mode Manual Navigation Without Using TTN (Type-To-Narrow) to Add Parts to Shopping Cart Using Plus Button
@NoExecute
Scenario Outline: List Mode Manual Navigation to Add Parts to Shopping Cart
Given SC6 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is List
When User Manually List Navigate To SBS From Home
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

Examples:
|Lineup|Model Type|Catalog|Section|Figure|Part|
|"Trucks"|"C&E"|"10723 - CVR LHD 96 - 00"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-07 - CLUTCH BOOSTER; MINIPACK"|"1-31824-159-0"|
|"Passenger Vehicle"|"SUV"|"50919 - TBR (GM-INDONESIA) 02 -"|"3 - BRAKE,BRAKES SYSTEM"|"3-30 - BRAKE MASTER CYLINDER"|"8-94478-836-1"|
|"Buses"|"LR"|"10708 - LR 96 - 98"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-65 - STARTER"|"1-81121-064-0"|

# Scenario-7: Full VIN Navigation to SBS and Add Parts to Shopping Cart Using Plus Button
@NoExecute
Scenario Outline: Full VIN Navigation to SBS in Graphical Mode to Add Parts to Shopping Cart
Given SC7 Test Data as <VIN> <Model> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is Graphical
When User Navigate To SBS From Home Using Full VIN
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

Examples:
|VIN|Model|Model Type|Catalog|Section|Figure|Part|
|"JAANLR85EB7100007"|"Trucks"|"N"|"51275 - NLR/NMR(85) AUST/NZ EURO5 11 - 1"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-01 - PARTIAL ENGINE"|"5-87311-111-5"|
|"NKR66E7484755"|"Truck"|"N"|"50671 - NKR 93 - 98"|"1 - FUEL TANK,COOLING,AIR INTAKE,EXHAUST SYSTEM"|"1-10 - RADIATOR"|"8-97131-155-1"|

# Scenario-8: Partial VIN Navigation to SBS and Add Parts to Shopping Cart Using Plus Button
@NoExecute
Scenario Outline: Partial VIN Navigation to SBS in List Mode to Add Parts to Shopping Cart
Given SC8 Test Data as <PartialVIN> <VIN> <Model> <Model Type> <Catalog> <Section> <Figure> <Part>
Given Navigation Mode is List
When User Navigate To SBS From Home Using Partial VIN
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

Examples:
|PartialVIN|VIN|Model|Model Type|Catalog|Section|Figure|Part|
|"123456"|"6BG1123456"|"Industrial Engine"|"3-cylinder"|"50348 - 3AA1/3AB1/3AD1 76 - 91"|"0 - ENGINE,EMISSION,ENGINE ELECTRICAL"|"0-10 - CYLINDER HEAD COVER"|"9-11750-602-0"|
#3AB1123456 (Wrong)  6BG1123456 (Right)