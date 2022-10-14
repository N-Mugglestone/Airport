# Welcome to the Airport Challenge

This project was part of my DF Academy journey, and it's purpose was to help me gain a better understanding of conditional statements and how to make these kinds of statements run together. 

The tools I used in this project were very simple, and I personally found that in this situation a flow diagram worked the best with very easy to understand Yes and No conditions as well as the suitable responses to each varible. 

<div align="center">
<img src="https://media2.giphy.com/media/TFUGLiAZFJzZGaLh4J/200w.webp?cid=ecf05e47yop42uh7c7yjw9w32jlyjdbeft5mjv6ujoslag08&rid=200w.webp&ct=s" title="YesOrNo" alt="YesOrNo" height="150" width="300"
/>
</div>


This application was primarily Java based (with Maven as a building tool) which was a challenge, in that Java was still pretty new to me at the time. This project was a nice introduction to the similarities in languages which was a great help to me in my learning experience. 

---

### The requirements for this project were given as follows ⏬

Airport Challenge
=================

```
         ______
        __\____\___
=  = ==(____DFA____)
           \_____\__________________,-~~~~~~~`-.._
          /     o o o o o o o o o o o o o o o o  |\_
          `~-.__       __..----..__                  )
                `---~~\___________/------------`````
                =  ===(_________)

```

Instructions
---------

* Feel free to use google, your notes, books, etc. but work on your own.
* Keep it SIMPLE - it's not nearly as complicated as it first may look.
* Use the JUnit test framework and evidence your test-driven development by committing on passing tests.
* Please write your own README detailing how to install your project, how to run the tests, how you approached the problem and provide screenshots of interacting with your program.
* If you refer to the solution of another coach or student, please put a link to that in your README.
* Please create separate files for every class, module, and spec.

Steps
-------

1. Fork this repo, and clone to your local machine
2. Open it in IntelliJ Community Edition
3. Open `src/main/java/Aiport.java` and if there is a message about *SDK* or *adoptOpen* not being available, got through the steps to point it at your Java installation 
4. Convert stories into a representative domain model and test-drive your work.
5. Remember to write a `public static void main` method that creates your airport and lands and takes some planes off, producing console outputs as it goes!

Task
-----

We have a request from a client to write the software to control the flow of planes at an airport. The planes can land and take off provided that the weather is sunny. Occasionally it may be stormy, in which case no planes can land or take off.  Here are the user stories that we worked out in collaboration with the client:

#### Acceptance Criteria
```
As an air traffic controller
So I can get passengers to a destination
I want to instruct the airport to land a plane

As the system designer
So that the software can be used for many different airports
I would like a default airport capacity that can be overridden as appropriate

As an air traffic controller
To ensure safety
I want to prevent landing when the airport is full

As an air traffic controller
So I can get passengers on the way to their destination
I want to instruct the airport to let a plane take off and confirm that it is no longer in the airport

As an air traffic controller
To avoid confusion
I want to prevent asking the airport to let planes take-off which are not at the airport, or land a plane that's already landed
```

#### Extended Acceptance Criteria
```
As an air traffic controller
To ensure safety
I want to prevent takeoff when weather is stormy

As an air traffic controller
To ensure safety
I want to prevent landing when weather is stormy

As an air traffic controller
To count planes easily
Planes that have landed must be at an airport
```

Your task is to test drive the creation of a set of classes/objects to satisfy all the above user stories. You will need to use a random number generator to set the weather (it is normally sunny but on rare occasions it may be stormy). In your tests, you'll need to stub random behaviour to ensure consistent test behaviour.

Your code should defend against [edge cases](http://programmers.stackexchange.com/questions/125587/what-are-the-difference-between-an-edge-case-a-corner-case-a-base-case-and-a-b) such as inconsistent states of the system ensuring that planes can only take off from airports they are in; planes that are already flying cannot take off and/or be in an airport; planes that are landed cannot land again and must be in an airport, etc.


As you can see, things could get a bit stormy at times


<div align="center">
<img src="https://media1.giphy.com/media/M9tpu3TPG42n6/100.webp?cid=ecf05e47c5p8lc7h0xgxx70ebabzrjcbyaxj22fq11fkb5o7&rid=100.webp&ct=g" title="Airplane" alt="Airplane"
height="300" width="600"/>
</div>
