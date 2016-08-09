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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSInputServerMouseTracker;
import mac.appkit.protocol.NSInputServiceProvider;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSInputServer extends NSObject implements NSInputServiceProvider,
		NSInputServerMouseTracker {
	static {
		NatJ.register();
	}

	@Generated
	protected NSInputServer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("activeConversationChanged:toNewConversation:")
	public native void activeConversationChangedToNewConversation(
			@Mapped(ObjCObjectMapper.class) Object sender, long newConversation);

	@Generated
	@Selector("activeConversationWillChange:fromOldConversation:")
	public native void activeConversationWillChangeFromOldConversation(
			@Mapped(ObjCObjectMapper.class) Object sender, long oldConversation);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSInputServer alloc();

	@Generated
	@Selector("canBeDisabled")
	public native boolean canBeDisabled();

	@Generated
	@Selector("doCommandBySelector:client:")
	public native void doCommandBySelectorClient(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("init")
	public native NSInputServer init();

	@Generated
	@Selector("initWithDelegate:name:")
	public native NSInputServer initWithDelegateName(
			@Mapped(ObjCObjectMapper.class) Object aDelegate, String name);

	@Generated
	@Selector("inputClientBecomeActive:")
	public native void inputClientBecomeActive(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientDisabled:")
	public native void inputClientDisabled(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientEnabled:")
	public native void inputClientEnabled(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientResignActive:")
	public native void inputClientResignActive(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertText:client:")
	public native void insertTextClient(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("markedTextAbandoned:")
	public native void markedTextAbandoned(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("markedTextSelectionChanged:client:")
	public native void markedTextSelectionChangedClient(
			@ByValue NSRange newSel,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("mouseDownOnCharacterIndex:atCoordinate:withModifier:client:")
	public native boolean mouseDownOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("mouseDraggedOnCharacterIndex:atCoordinate:withModifier:client:")
	public native boolean mouseDraggedOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("mouseUpOnCharacterIndex:atCoordinate:withModifier:client:")
	public native void mouseUpOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("terminate:")
	public native void terminate(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("wantsToDelayTextChangeNotifications")
	public native boolean wantsToDelayTextChangeNotifications();

	@Generated
	@Selector("wantsToHandleMouseEvents")
	public native boolean wantsToHandleMouseEvents();

	@Generated
	@Selector("wantsToInterpretAllKeystrokes")
	public native boolean wantsToInterpretAllKeystrokes();
}
