Test project for Groovy on RoboVM
=================================

Prerequisites
-------------

On Linux, follow the instructions at https://github.com/robovm/robovm/wiki/Get-started-on-Linux

On Mac OS X, follow the instructions for [Command Line Tools Installation](https://github.com/robovm/robovm-docs/blob/master/src/main/asciidoc/index.adoc#command-line-tools-installation)

Clone the repository
--------------------

    git clone https://github.com/melix/robovm-groovy-test.git
    cd robovm-groovy-test

Compile & Run
-------------

    ./gradlew roboRun

Build a Native Executable
-------------------------

    ./gradlew roboBuild

The executable is built in `build/bin/robovm-groovy-test`. See how fast it runs:

    time ./build/bin/robovm-groovy-test



