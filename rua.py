# Script Name       : fileinfo.py
# Author                : Not sure where I got this from
# Created               : 28th November 2011
# Last Modified     :
# Version               : 1.0
# Modifications     :

# Description           : Show file information for a given file


# get file information using os.stat()
# tested with Python24 vegsaeat 25sep2006
from __future__ import print_function

import os
import stat  # index constants for os.stat()
import sys
import time

if sys.version_info >= (3, 0):
    raw_input = input

file_name = raw_input("Enter a file name: ")  # pick a file you have
count = 0
t_char = 0
try:
    with open(file_name) as f:
        line = f.readline()
        t_char += len(line)
        while line:
            count += 1
            line = f.readline()
            t_char += len(line)
except FileNotFoundError as e:
    print(e)
    sys.exit()

file_stats = os.stat(file_name)
# create a dictionary to hold file info
file_info = {
    'fname': file_name,
    'fsize': file_stats[stat.ST_SIZE],
    'f_lm': time.strftime("%d/%m/%Y %I:%M:%S %p",
                          time.localtime(file_stats[stat.ST_MTIME])),
    'f_la': time.strftime("%d/%m/%Y %I:%M:%S %p",
                          time.localtime(file_stats[stat.ST_ATIME])),
    'f_ct': time.strftime("%d/%m/%Y %I:%M:%S %p",
                          time.localtime(file_stats[stat.ST_CTIME])),
    'no_of_lines': count,
    't_char': t_char
}

print("\nfile name =", file_info['fname'])
print("file size =", file_info['fsize'], "bytes")
print("last modified =", file_info['f_lm'])
print("last accessed =", file_info['f_la'])
print("creation time =", file_info['f_ct'])
print("Total number of lines are =", file_info['no_of_lines'])
print("Total number of characters are =", file_info['t_char'])