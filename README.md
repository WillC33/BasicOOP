<h1> Own OOP Project</h1>

outlined in workbook 4b

<h2>Structure</h2>
the project is made up currently of 1 abstract class 'BakedGoods'
this is extended by the bread class which implements a default method in 'YeastyRaisings' to lengthen bake time
finally there is a launcher containing the main method, this defines an instance of bread and calls some methods on it

<h2>Functioning</h2>
The programme basically 'bakes' and 'sells' bread, it can define new classes of baked goods (fully bread atm) and has public methods to bake and sell stock.
The bake mthod replenishes to a set amount of loaves and sell takes an int parameter for amount of sales
There is a private method to automatically notify when the loaves are out of stock.

Many further improvements are needed to move this past a POC stage.


<h2>Output</h2>
What is the bread?
bagel
The bread is rising...
All done!
You now have 6 loaves
You have 3 bagel left...
You have 0 bagel left...
86 the bagel

Process finished with exit code 0