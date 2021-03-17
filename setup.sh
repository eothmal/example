#!/bin/bash
# find . -name '*.java' > cscope.files
# find . -name '*.html' >> cscope.files
mkdir -p ~/.vim/plugin && \
cp *.vim ~/.vim/plugin/. && \
cscope -b
cp dotvirc ~/.vimrc

