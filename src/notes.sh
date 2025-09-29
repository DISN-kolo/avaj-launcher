find . -name "*.java" > SOURCES
javac -Xlint:all -Werror @SOURCES
java ft.avaj.simulator.Simulator
