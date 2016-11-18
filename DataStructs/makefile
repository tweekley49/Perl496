MAIN=src/main.cpp
SRCS := $(filter-out $(MAIN),$(wildcard src/*.cpp))
CFLAGS=-O2 -I src/
.PHONY: clean test all

all:
	g++ -o array-test $(CFLAGS) ${SRCS} ${MAIN}

run: all
	./array-test

equal-test:
	cxxtestgen --runner=ErrorPrinter -o tests/test-runner.cpp tests/equal-test.cpp ${SRCS}
	g++ ${CFLAGS} tests/test-runner.cpp $(SRCS) -o test-runner
	./test-runner

index-of-test:
	cxxtestgen --runner=ErrorPrinter -o tests/test-runner.cpp tests/index-of-test.cpp ${SRCS}
	g++ ${CFLAGS} tests/test-runner.cpp $(SRCS) -o test-runner
	./test-runner

get-test:
	cxxtestgen --runner=ErrorPrinter -o tests/test-runner.cpp tests/get-test.cpp ${SRCS}
	g++ ${CFLAGS} tests/test-runner.cpp $(SRCS) -o test-runner
	./test-runner

remove-test:
	cxxtestgen --runner=ErrorPrinter -o tests/test-runner.cpp tests/remove-test.cpp ${SRCS}
	g++ ${CFLAGS} tests/test-runner.cpp $(SRCS) -o test-runner
	./test-runner

set-test:
	cxxtestgen --runner=ErrorPrinter -o tests/test-runner.cpp tests/set-test.cpp ${SRCS}
	g++ ${CFLAGS} tests/test-runner.cpp $(SRCS) -o test-runner
	./test-runner

clean:
	rm -rf array-test tests/test-runner.cpp test-runner
