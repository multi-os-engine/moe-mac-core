/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

//
//  AppKit.m
//

#import <AppKit/NSEvent.h>
#import <AppKit/NSLayoutConstraint.h>
#import <CoreGraphics/CGBase.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT NSUInteger __natj_inline_NSEventMaskFromType(NSEventType type) {
	return NSEventMaskFromType(type);
}

EXPORT NSEdgeInsets __natj_inline_NSEdgeInsetsMake(CGFloat top, CGFloat left, CGFloat bottom, CGFloat right) {
	return NSEdgeInsetsMake(top, left, bottom, right);
}


