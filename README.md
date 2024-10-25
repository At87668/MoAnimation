## Ah, I'm sorry, I'm so sorry, right now I'm focusing on Spigot/BungeeCord plugin writing
## So I abandoned the project
## ):

# More Animation 


- This a Fork for Mo' Bends
- If you are interested in this project, welcome to develop it together.
- `Please note: We do not provide support for versions of Minecraft other than 1.16.5!`
<!--
[![Bilibili Icon](https://www.bilibili.com/favicon.ico)](https://space.bilibili.com/1098279072)
[![Bilibili Home Page](https://img.shields.io/badge/-SUBSCRIBE%20ME-blue.svg?style=flat-square)](https://space.bilibili.com/1098279072)
-->
### SUBSCRIBE ME
[![Bilibili Home Page](https://img.shields.io/badge/-bilibili-blue.svg?style=flat-square)](https://space.bilibili.com/1098279072)
[![MCMOD Home Page](https://img.shields.io/badge/-mcmod-darkgreen.svg?style=flat-square)](https://center.mcmod.cn/420490/)
[![GitHub Home Page](https://img.shields.io/badge/-Github-gray.svg?style=flat-square)](https://github.com/At87668/)

[![GitHub Issues](https://img.shields.io/badge/Github%20Issues-0%20Open-brightgreen.svg?style=flat-square)](https://github.com/At87668/MoreAnimation/isseus)
[![GitHub Pulls](https://img.shields.io/badge/Github%20Pulls-0%20Pull%20requests-brightgreen.svg?style=flat-square)](https://github.com/At87668/MoreAnimation/pulls)

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
