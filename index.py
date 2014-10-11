#!/usr/bin/python
import os
import markdown

def getInfo(filepath):
	title_prompt, time_prompt, tags_prompt = "leetcode - ", "- Time: ", "- Tags: "
	info = {"path":filepath, "title":"", "time":[], "tags":[]}
	for line in open(filepath, 'r'):
		if title_prompt in line:
			info["title"] = line.split(title_prompt)[1].strip()
		if time_prompt in line:
			info["time"] = [s.strip() for s in line.split(time_prompt)[1].split(", ")]
		if tags_prompt in line:
			info["tags"] = [s.strip() for s in line.split(tags_prompt)[1].split(", ")]
	return info

def categorize(plist, field):
	index = {}
	for i, p in enumerate(plist):
		for key in p[field]:
			if key in index:
				index[key].append(i)
			else:
				index[key] = [i]
	return index

def compile(dir, index, field):
	mdstr = "# %s\n" % ("index of " + field)
	for key in index:
		mdstr += "\n## %s\n" % key
		for p in index[key]:
			mdstr += "- [%s](%s)\n" % (plist[p]["title"], plist[p]["path"])
	html = markdown.markdown(mdstr)
	print html



probnames = [d for d in os.listdir(os.getcwd()) if os.path.isdir(d) and d[0] != '.']
plist = []
for p in probnames:
	fpath = os.path.join(p, "Problem.md")
	if os.path.isfile(fpath):
		plist.append(getInfo(fpath))
time = categorize(plist, "time")
tags = categorize(plist, "tags")
compile(".index", time, "time")



	






