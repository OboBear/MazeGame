#! /bin/bash

read commitString
echo "commitString: "commitString
git add ./
git commit -m commitString
git push origin master

echo "push to github success!"
