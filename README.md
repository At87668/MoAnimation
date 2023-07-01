# More Animation 

- This a Fork for Mo' Bends

[![GitHub pull requests]()](https://github.com/At87668/MoreAnimation/pulls)
[![GitHub issues]()](https://github.com/At87668/MoreAnimation/issues)

A Minecraft mod that adds more realistic looking animations to the inhabitants of your blocky world.

## Setting up
1. Download the appropriate Minecraft Forge MDK, copy the following files/folders to the root of the repository:
    - `./gradlew`
    - `./gradlew.bat`
    - `./gradle/*`
    
2. Run either of the following commands
    - For IntelliJ:
        ```bash
        # This will setup an initial IntelliJ project
        ./gradlew genIntellijRuns
        ```
    - For Eclipse:
        ```bash
        # This will setup an initial Eclipse project
        ./gradlew genEclipseRuns
        ```

## Bulding for deployment
To build the mod for deployment, for example to put on CurseForge, follow the steps below:
1. Run the `./gradlew build` command.
2. Enjoy!

## Publishing the source locally for addons
To publish the library locally for addons to use, use the following command:
```bash
# Publishing the lib to a local maven repository
./gradlew build publish
```
