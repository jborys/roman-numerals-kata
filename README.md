# Roman Numerals Kata
### Overview
Roman numerals is a numbering system which uses Latin alpha characters to represent a known set of numbers and combinations of these to represent all others. 

### Objectives
Write a function which can take any integer from 1-1000 and return its Roman numeral representation as a string.
- Combine Roman numerals to make bigger numbers, e.g. I = 1, II = 2 (1 + 1), VI = 6 (5 + 1). 
Larger numerals come before (left of) smaller ones.
- You cannot combine more than three of the same numeral, e.g. IIII = 4 is not valid. Instead, you must use the next numeral up and prefix it with a numeral to subtract from it, e.g. IV = 4 (1 less than 5), XL = 40 (10 less than 50). 
You can spot these exceptional cases because the smaller numeral comes before (left of) the larger.

### Single character numerals
| Arabic number	 | Roman numeral | 
|----------------|---------------|
| 1	             | I             |
| 5	             | V             |
| 10	         | X             |
| 50             | L             |
| 100	         | C             |
| 500	         | D             |
| 1000	         | M             |


Convert Arabic numbers (the one we use daily: 1, 2, 3, 4, 5, …) into their Roman equivalent: I, II, III, IV, V, …
The big differences between Roman and Arabic numerals (the ones we use today) are that Romans didn't have a symbol for zero, and that numeral placement within a number can sometimes indicate subtraction rather than addition.

### Basic Conversions
| Arabic number | Roman numeral | Arabic number | Roman numeral | Arabic number | Roman numeral |
|---------------|---------------|---------------|---------------|---------------|---------------|
| 2             | II            | 20            | XX            | 200           | CC            |
| 3             | III           | 30            | XXX           | 300           | CCC           |
| 4             | IV            | 40            | XL            | 400           | CD            |
| 6             | VI            | 60            | LX            | 600           | DC            |
| 7             | VII           | 70            | LXX           | 700           | DCC           |
| 8             | VIII          | 80            | LXXX          | 800           | DCCC          |
| 9             | IX            | 90            | XC            | 900           | CM            |

### Advanced Conversions
| Arabic number | Roman numeral | Hundreds | Tens | Ones |
|---------------|---------------|----------|------|------|
| 42            | XLII          | XL       | XL   | II   |
| 584           | DLXXXIV       | D        | LXXX | IV   |
| 777           | DCCLXXVII     | DC       | LXX  | VII  |
| 999           | CMXCIX        | CM       | XC   | IX   |

[Verify your own conversions here.](https://www.romannumerals.org/converter)

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
