#!/bin/bash

converting(){
IMAGE_PATH=$(pwd)
eval cd "${IMAGE_PATH}"

if [ ! -d jpg ]
then
	mkdir jpg
fi

for image in *.png
do
	local IMAGE_WITHOUT_EXTENSION=$(ls $image | awk -F. '{ print $1 }')
        convert $IMAGE_WITHOUT_EXTENSION.png jpg/$IMAGE_WITHOUT_EXTENSION.jpg
done
}

converting 2>converting_errors_log.txt
if [ $? -eq 0  ]
then
	echo "Successful conversion!"
else
	echo "Process failed"
fi
