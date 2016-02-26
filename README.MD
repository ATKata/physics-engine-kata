Physics Simulation Kata
===
In this kata you will be applying some simple laws of physics to a moving body (e.g. a planet) within a 2D universe.


Simulator
---
There is a runnable simulator class which contains a swing application that may help with visualization however you don't need to use this.

If you choose to use it, you will need to add your bodies to the universe in the simulator constructor.

*Note: body positions are adjusted so that the origin (0,0) is at the center of the screen and positive y positions are above this.*


Kata Steps / Business Rules
---
1) A body should have an initial position (x, y).

2) A body should have an initial velocity.

3) After one unit of time the bodies position should change according to its velocity.

    Note: `distance = speed x time`

4) The universe should be able to apply an acceleration onto the body. After one unit of time the bodies velocity should change according to its acceleration.

    Note: `[new velocity] = [old velocity] + [acceleration x time]`

5) All bodies should have a mass.

6) Instead of applying an acceleration, the universe should be able to apply a force.

    Note: `acceleration` = `force / mass`

7) Photons (light) have a mass of 0 and always move at the speed of light. These should not accelerate under any force.

8) The universe should be able to simulate multiple bodies at once (ignore collisions).

9) Because a body has mass, it should also have a gravitational attraction which applies a force to all other bodies in the universe, pulling them towards it.

    Note: `force = [a small constant] x [mass of body 1] x [mass of body 2] / [distance between them squared]`

    Note: `[acceleration applied to other body] = [a small constant] x [mass of other body] / [distance between other body and you squared]`

    Note: `[distance between two bodies squared] = ([difference in x coordinates] squared) + ([difference in y coordinates] squared)`

    you can decide the value of `[a small constant]` or ignore it completely


Questions
---
Should a body know about its position and velocity? Or is it the universes responsibility to know that?

Do the laws of physics belong to the universe or the simulation?