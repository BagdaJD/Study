cmake_minimum_required(VERSION 4.1)
project(Lab1_fract)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(Lab1_fract
        Fract.cpp
        fract.h
        Source.cpp)
