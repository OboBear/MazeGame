#! /bin/bash

read commitString
git add ./
git commit -m commitString
git push origin master

echo "push to github success!"$commitString
