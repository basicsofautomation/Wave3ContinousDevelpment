Feature: Preview Illustrations

# Scenario-101: Use Preview illustration to see the illustration images and select the desired image that user is looking for to find the part via manual navigation.
Scenario Outline: Navigate to illustration other than default and return back to default illustration after adding part to shopping cart
Given SC101 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Figure> <Default Image> <Next Image> <Part>
Given Navigation Mode is List
When User Manually List Navigate To SBS From Home Via TTN
And Preview Illustration And Select For Part Lookup
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart
And User Navigate Back To Previous Image Via ReturnTo HyperLink 

@Execute
Examples:
|Lineup|Model Type|Catalog|Section|Figure|Default Image|Next Image|Part|
|"Trucks"|"Q"|"51423 - QKR RHD 12 -"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-05 - CLUTCH PIPING"|"[205A]4JB1-NA"|"[205A]4JB1-TC"|"8-98090-655-0"|
#|"Trucks"|"Q"|"51423 - QKR RHD 12 -"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-36 - MANUAL TRANSMISSION CONT LINK AND CABLE"|"[236A]NO.1"|"[236A]NO.3"|"1-09760-118-1"|

# Scenario-102: Navigate in illustrations using next and previous illustration arrow button
Scenario Outline: Use next illustration arrow key to move to next Figure when illustration has single image
Given SC102 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Default Figure> <Default Image> <Next Figure> <Next Image> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home Via TTN
And Navigate to next figure using right arrow button
And Add Parts to Shopping Cart Using Plus Button
Then Added Parts Appear in Shopping Cart

@NoExecute
Examples:
|Lineup|Model Type|Catalog|Section|Default Figure|Default Image|Next Figure|Next Image|Part|
|"Trucks"|"Q"|"51423 - QKR RHD 12 -"|"2 - CLUTCH,TRANSMISSION,TRANS AXLE"|"2-08 - CLUTCH MASTER CYLINDER"|"[208A]01"|"2-20 - MANUAL TRANSMISSION ASM AND CASE"|"[220A]01"|"5-87220-275-0"|


# Scenario-103: Use Previous illustration arrow key to move to Previous Figure via manual navigation
Scenario Outline: Previous illustration arrow key to move to Previous Figure when illustration has single image
Given SC103 Test Data as <Lineup> <Model Type> <Catalog> <Section> <Default Figure> <Default Image> <Previous Figure> <Previous Image> <Part>
Given Navigation Mode is Graphical
When User Manually Graph Navigate To SBS From Home Via TTN
And Navigate to previous figure using left arrow button
And Add Parts to Shopping Cart Using Space Bar
Then Added Parts Appear in Shopping Cart

@Execute
Examples:
|Lineup|Model Type|Catalog|Section|Default Figure|Default Image|Previous Figure|Previous Image|Part|
|"Trucks"|"N"|"51145 - NHR 08 -"|"4 - PROPELLER SHAFT,AXLES,STEERING,SUSPENSION"|"4-40 - STEERING UNIT"|"[440A]01"|"4-36 - POWER STEERING CONTROL; ENGINE SIDE"|"[436A]01"|"8-98043-205-4"|
