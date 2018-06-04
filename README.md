# Gloomhaven Stats Tracker

This small application is a companion app for the Gloomhaven game and provides a HP / XP tracker either as a replacement
for the cardboard component or for a potential 5th player.

This application is written for Android in Kotlin

## Local Setup

In order to develop this app, please use `Android Studio` and additionally install `KtLint`, both of them can be
installed via `homebrew`:

    brew cask install android-studio
    brew install shyiko/ktlint/ktlint

Check out the project to a local folder on your machine and import the project in Android Studio.

Afterwards set up the basic codestyle rules via ktlint:

1. Navigate to the local repository
2. Run `ktlint --apply-to-idea-project --android`
3. Reopen Android Studio

## Static Code Analysis and Formatting

This project uses [detekt](https://github.com/arturbosch/detekt) and [ktlint](https://github.com/shyiko/ktlint) via [spotless](https://github.com/diffplug/spotless/tree/master/plugin-gradle) for code analysis and formatting.

The code analysis plugins are run, whenever `gradle check` is invoked.

To format your code, you can run `gradle spotlessApply`.
