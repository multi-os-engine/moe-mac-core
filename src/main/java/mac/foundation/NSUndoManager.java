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

package mac.foundation;


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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUndoManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUndoManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUndoManager alloc();

	@Generated
	@Selector("beginUndoGrouping")
	public native void beginUndoGrouping();

	@Generated
	@Selector("canRedo")
	public native boolean canRedo();

	@Generated
	@Selector("canUndo")
	public native boolean canUndo();

	@Generated
	@Selector("disableUndoRegistration")
	public native void disableUndoRegistration();

	@Generated
	@Selector("enableUndoRegistration")
	public native void enableUndoRegistration();

	@Generated
	@Selector("endUndoGrouping")
	public native void endUndoGrouping();

	@Generated
	@Selector("groupingLevel")
	public native long groupingLevel();

	@Generated
	@Selector("groupsByEvent")
	public native boolean groupsByEvent();

	@Generated
	@Selector("init")
	public native NSUndoManager init();

	@Generated
	@Selector("isRedoing")
	public native boolean isRedoing();

	@Generated
	@Selector("isUndoRegistrationEnabled")
	public native boolean isUndoRegistrationEnabled();

	@Generated
	@Selector("isUndoing")
	public native boolean isUndoing();

	@Generated
	@Selector("levelsOfUndo")
	public native long levelsOfUndo();

	@Generated
	@Selector("prepareWithInvocationTarget:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object prepareWithInvocationTarget(
			@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("redo")
	public native void redo();

	@Generated
	@Selector("redoActionIsDiscardable")
	public native boolean redoActionIsDiscardable();

	@Generated
	@Selector("redoActionName")
	public native String redoActionName();

	@Generated
	@Selector("redoMenuItemTitle")
	public native String redoMenuItemTitle();

	@Generated
	@Selector("redoMenuTitleForUndoActionName:")
	public native String redoMenuTitleForUndoActionName(String actionName);

	@Generated
	@Selector("registerUndoWithTarget:selector:object:")
	public native void registerUndoWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("removeAllActions")
	public native void removeAllActions();

	@Generated
	@Selector("removeAllActionsWithTarget:")
	public native void removeAllActionsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("runLoopModes")
	public native NSArray runLoopModes();

	@Generated
	@Selector("setActionIsDiscardable:")
	public native void setActionIsDiscardable(boolean discardable);

	@Generated
	@Selector("setActionName:")
	public native void setActionName(String actionName);

	@Generated
	@Selector("setGroupsByEvent:")
	public native void setGroupsByEvent(boolean groupsByEvent);

	@Generated
	@Selector("setLevelsOfUndo:")
	public native void setLevelsOfUndo(long levels);

	@Generated
	@Selector("setRunLoopModes:")
	public native void setRunLoopModes(NSArray runLoopModes);

	@Generated
	@Selector("undo")
	public native void undo();

	@Generated
	@Selector("undoActionIsDiscardable")
	public native boolean undoActionIsDiscardable();

	@Generated
	@Selector("undoActionName")
	public native String undoActionName();

	@Generated
	@Selector("undoMenuItemTitle")
	public native String undoMenuItemTitle();

	@Generated
	@Selector("undoMenuTitleForUndoActionName:")
	public native String undoMenuTitleForUndoActionName(String actionName);

	@Generated
	@Selector("undoNestedGroup")
	public native void undoNestedGroup();
}
