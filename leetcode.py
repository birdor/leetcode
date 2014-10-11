#!/usr/bin/python

# leetcode the-new-problem
# leetcode -index

import sys
import os
import webbrowser
import string 
import datetime

subl = "/Applications/Sublime\ Text\ 2.app/Contents/SharedSupport/bin/subl "

assert len(sys.argv) <= 2

sProblem = '## leetcode - %s\n- Time: %s\n- Tags: \n\n### Problem Description [link][1]\n\n### Solution\n```java\n```\n\n[1]: %s "%s"\n'
sSolution = "/**\n\tleetcode - %s\n\tTime: \n\tSpace: \n\tCompleted:\n*/"
sTest = "import java.util.Scanner;\n\npublic class test{\n\tpublic static void main(String[] args){\n\t}\n}"


def preprocess(argin):
	if '/' in argin:
		problem = argin.split('/')[-2]
	else:
		problem = argin
	url = "https://oj.leetcode.com/problems/" + problem + "/"
	path = os.path.join(os.getcwd(), problem)
	words = problem.split('-')
	for i, word in enumerate(words):
		words[i] = word.capitalize()
	title = string.join(words, ' ')
	return title, path, url


def initEmptyDir(path, title):
	if not os.path.isdir(path):
		os.mkdir(path)
	if not os.path.isfile(os.path.join(path, "Problem.md")):
		f = open(os.path.join(path, "Problem.md"), "w")
		today = datetime.date.today()
		date = "%4d.%02d.%02d" % (today.year, today.month, today.day)
		print date
		print >> f, sProblem % (title, date, url, url.split('/')[-2])
		f.close()
	if not os.path.isfile(os.path.join(path, "Solution.java")):
		f = open(os.path.join(path, "Solution.java"), "w")
		print >> f, sSolution % title
		f.close()
	if not os.path.isfile(os.path.join(path, "test.java")):
		f = open(os.path.join(path, "test.java"), "w")
		print >> f, sTest 




if len(sys.argv) == 2:
	title, path, url = preprocess(sys.argv[1])
	webbrowser.open(url, new = 2, autoraise = False)
	initEmptyDir(path, title)
	os.system(subl + path)
	os.system(subl + os.path.join(path, "Problem.*"))
	os.system(subl + os.path.join(path, "*.java"))
else:
	os.system(subl + os.getcwd())





