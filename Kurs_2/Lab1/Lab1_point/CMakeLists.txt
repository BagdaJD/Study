cmake_minimum_required(VERSION 4.1)
project(Lab1_point)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(Lab1_point
        main.cpp
        point.cpp
        point.h
        TestClassesLab.cpp)
