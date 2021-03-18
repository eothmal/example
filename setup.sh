#!/bin/bash
# find . -name '*.java' > cscope.files
# find . -name '*.html' >> cscope.files
# find /my/project/dir -name '*.c' -o -name '*.h' > /foo/cscope.files
mkdir -p ~/.vim/plugin && \
cp *.vim ~/.vim/plugin/. && \
cscope -b
cp dotvimrc ~/.vimrc

