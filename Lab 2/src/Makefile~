JC = javac
JFLAGS = -g -cp
HTMLPARSER = /Users/Raymond/Projects/htmlparser1_6/lib/htmlparser.jar
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(HTMLPARSER) $*.java

CLASSES = \
	  Crawler.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
