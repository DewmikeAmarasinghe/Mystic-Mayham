# Mystic Mayham

Mystic Mayham is a turn-based strategy game where players build armies of fantasy characters and battle against each other. The game features various character classes, each with unique abilities and stats, and different home grounds that provide strategic advantages.

## Game Features

- **Multiple Character Classes**: Choose from various character types including Knights, Archers, Mages, Healers, and Mythical Creatures.
- **Strategic Combat**: Engage in turn-based battles with a focus on strategy and character positioning.
- **Home Grounds**: Different battlefields that provide unique bonuses to certain character types.
- **Character Progression**: Level up your characters and unlock new abilities as you play.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Git (optional, for version control)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/mystic-mayham.git
   cd mystic-mayham
   ```

2. Compile the source code:
   ```bash
   javac -d bin src/**/*.java
   ```

3. Run the game:
   ```bash
   java -cp bin App
   ```

## Project Structure

```
mystic-mayham/
├── bin/                  # Compiled .class files
├── src/                  # Source files
│   ├── Characters/       # Character classes
│   │   ├── Archers/      # Archer characters
│   │   ├── Healers/      # Healer characters
│   │   ├── Knights/      # Knight characters
│   │   ├── Mages/        # Mage characters
│   │   └── MythicalCreatures/ # Mythical creatures
│   ├── Equipment/        # Equipment and items
│   ├── Game/             # Core game logic
│   ├── HomeGrounds/      # Battlefield types
│   └── Player/           # Player-related classes
└── README.md             # This file
```

## How to Play

1. **Main Menu**:
   - Start a new game
   - Load a saved game
   - View instructions
   - Exit the game

2. **Game Setup**:
   - Enter your player name
   - Choose your home ground
   - Build your army by selecting characters

3. **Combat**:
   - Take turns with the AI opponent
   - Use character abilities strategically
   - Win by defeating all enemy characters

## Character Classes

### Knights
- **Squire**: Balanced melee fighter
- **Cavalier**: Mounted warrior with high mobility
- **Zorro**: Agile swordsman with high attack speed

### Archers
- **Shooter**: Basic ranged attacker
- **Ranger**: Specialized in long-range attacks
- **Sunfire**: Deals fire-based damage over time

### Mages
- **Warlock**: Dark magic specialist
- **Illusionist**: Master of deception
- **Eldritch**: Ancient magic user

### Healers
- **Soother**: Basic healing abilities
- **Medic**: Advanced healing and buffs
- **Saint**: Master healer with resurrection

### Mythical Creatures
- **Dragon**: Powerful flying creature
- **Basilisk**: Petrifying gaze
- **Phoenix**: Rebirth ability

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by classic turn-based strategy games
- Built with Java and lots of ☕
