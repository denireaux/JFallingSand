#!/bin/bash

if [ ! -d "assets/" ]; then 
    mkdir assets 
fi

echo "Cleaning build..."
./gradlew clean

echo "Running build..."
./gradlew lwjgl3:run

# ./gradlew clean && ./gradlew lwjgl3:run
