# Roman Numerals Kata
Convert Arabic numbers (the one we use daily: 1, 2, 3, 4, 5, …) into their Roman equivalent: I, II, III, IV, V, …
The Romans were active in trade and commerce, and from the time of learning to write they needed a way to indicate numbers. The system they developed lasted many centuries, and still sees some specialized use today.

Roman numerals traditionally indicate the order of rulers or ships who share the same name (i.e. Queen Elizabeth II). They are also sometimes still used in the publishing industry for copyright dates, and on cornerstones and gravestones when the owner of a building or the family of the deceased wishes to create an impression of classical dignity. The Roman numbering system also lives on in our languages, which still use Latin word roots to express numerical ideas. A few examples: unilateral, duo, quadricep, septuagenarian, decade, milliliter.

The big differences between Roman and Arabic numerals (the ones we use today) are that Romans didn't have a symbol for zero, and that numeral placement within a number can sometimes indicate subtraction rather than addition.

Here are the basics:
- I 	The easiest way to note down a number is to make that many marks - little I's. Thus I means 1, II means 2, III means 3. However, four strokes seemed like too many....
- V 	So the Romans moved on to the symbol for 5 - V. Placing I in front of the V — or placing any smaller number in front of any larger number — indicates subtraction. So IV means 4. After V comes a series of additions - VI means 6, VII means 7, VIII means 8.
- X 	X means 10. But wait — what about 9? Same deal. IX means to subtract I from X, leaving 9. Numbers in the teens, twenties and thirties follow the same form as the first set, only with X's indicating the number of tens. So XXXI is 31, and XXIV is 24.
- L 	L means 50. Based on what you've learned, I bet you can figure out what 40 is. If you guessed XL, you're right = 10 subtracted from 50. And thus 60, 70, and 80 are LX, LXX and LXXX.
- C 	C stands for centum, the Latin word for 100. A centurion led 100 men. We still use this in words like "century" and "cent." The subtraction rule means 90 is written as XC. Like the X's and L's, the C's are tacked on to the beginning of numbers to indicate how many hundreds there are: CCCLXIX is 369.
- D 	D stands for 500. As you can probably guess by this time, CD means 400. So CDXLVIII is 448. (See why we switched systems?)
- M 	M is 1,000. You see a lot of Ms because Roman numerals are used a lot to indicate dates. For instance, this page was written in the year of Nova Roma's founding, 1998 CE (Common Era; Christians use AD for Anno Domini, "year of our Lord"). That year is written as MCMXCVIII. But wait! Nova Roma counts years from the founding of Rome, ab urbe condita. By that reckoning Nova Roma was founded in 2751 a.u.c. or MMDCCLI.

### Notes:
For the purposes of practicing TDD, this is one of the more advanced katas you can do. 
By now you should be proficient with the basic skills of TDD - the 3 Laws of TDD, 
the Rule of Three for duplication, and you should be experienced in how to structure a 
unit test (Arrange, Act, Assert).

### The Transformation Priority Premise
#### The Trasnformations
The Transformations

    ({}–>nil) no code at all->code that employs nil
    (nil->constant)
    (constant->constant+) a simple constant to a more complex constant
    (constant->scalar) replacing a constant with a variable or an argument
    (statement->statements) adding more unconditional statements.
    (unconditional->if) splitting the execution path
    (scalar->array)
    (array->container)
    (statement->recursion)
    (if->while)
    (expression->function) replacing an expression with a function or algorithm
    (variable->assignment) replacing the value of a variable.



#### <u>[Three Laws of TDD](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd)</u>

1. You are not allowed to write any production code unless it is to make a failing unit test pass.
2. You are not allowed to write any more of a unit test than is sufficient to fail; 
and <i><strong>compilation failures are failures</strong></i>.
3. You are not allowed to write any more production code than is sufficient to pass 
the one failing unit test.

#### <u>[Rule of Three](https://en.wikipedia.org/wiki/Rule_of_three_(computer_programming))</u>
Rule of three ("Three strikes and you refactor") is a code refactoring rule of thumb to decide when 
similar pieces of code should be refactored to avoid duplication. It states that two instances of 
similar code do not require refactoring, but when similar code is used three times, it should be extracted 
into a new procedure.

#### Articles
- <u>[The Transformation Priority Premise](http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)</u>
- <u>[Applying Transformation Priority Premise to the Roman Numerals Kata by Pedro Santos](https://codurance.com/2015/05/18/applying-transformation-priority-premise-to-roman-numerals-kata/)</u>
