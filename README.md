# Snake Game
# Snake Game

This is a simple Java application that implements a classic Snake game. The game consists of a snake that moves around a grid and tries to eat food items that appear randomly on the screen. The snake grows longer as it eats more food, and the game ends if the snake hits the wall or its own body.

The main components of the game are:

- A `Snake` class that represents the snake object. It has attributes such as `head`, `body`, `direction`, and `color`. It also has methods such as `move()`, `grow()`, `draw()`, and `isDead()`.
- A `Food` class that represents the food object. It has attributes such as `x`, `y`, and `color`. It also has methods such as `draw()` and `isEaten()`.
- A `Game` class that controls the game logic. It has attributes such as `snake`, `food`, `score`, and `running`. It also has methods such as `start()`, `update()`, `render()`, and `stop()`.
- A `Window` class that handles the user interface. It has attributes such as `width`, `height`, `title`, and `canvas`. It also has methods such as `create()`, `show()`, and `close()`.

The game uses the Java Swing library for graphics and the Java AWT library for events. The game loop runs at 60 frames per second and updates the game state and renders the graphics accordingly. The user can control the snake's direction using the arrow keys on the keyboard.

![Screenshot 2022-10-13 225546](https://user-images.githubusercontent.com/71165326/195665693-dd7f700c-c157-4785-aabe-80d962b75d3d.png)
![Screenshot 2022-10-13 225741](https://user-images.githubusercontent.com/71165326/195665738-2848d418-17ae-451c-b678-448e1bb4c872.png)
