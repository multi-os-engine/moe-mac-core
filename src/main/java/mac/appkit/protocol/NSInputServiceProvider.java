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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSInputServiceProvider")
public interface NSInputServiceProvider {
	@Generated
	@Selector("activeConversationChanged:toNewConversation:")
	public void activeConversationChangedToNewConversation(
			@Mapped(ObjCObjectMapper.class) Object sender, long newConversation);

	@Generated
	@Selector("activeConversationWillChange:fromOldConversation:")
	public void activeConversationWillChangeFromOldConversation(
			@Mapped(ObjCObjectMapper.class) Object sender, long oldConversation);

	@Generated
	@Selector("canBeDisabled")
	public boolean canBeDisabled();

	@Generated
	@Selector("doCommandBySelector:client:")
	public void doCommandBySelectorClient(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientBecomeActive:")
	public void inputClientBecomeActive(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientDisabled:")
	public void inputClientDisabled(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientEnabled:")
	public void inputClientEnabled(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("inputClientResignActive:")
	public void inputClientResignActive(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertText:client:")
	public void insertTextClient(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("markedTextAbandoned:")
	public void markedTextAbandoned(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("markedTextSelectionChanged:client:")
	public void markedTextSelectionChangedClient(@ByValue NSRange newSel,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("terminate:")
	public void terminate(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("wantsToDelayTextChangeNotifications")
	public boolean wantsToDelayTextChangeNotifications();

	@Generated
	@Selector("wantsToHandleMouseEvents")
	public boolean wantsToHandleMouseEvents();

	@Generated
	@Selector("wantsToInterpretAllKeystrokes")
	public boolean wantsToInterpretAllKeystrokes();
}
