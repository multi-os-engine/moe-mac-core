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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CSSM_APPLE_TP_SMIME_OPTIONS extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CSSM_APPLE_TP_SMIME_OPTIONS() {
		super(CSSM_APPLE_TP_SMIME_OPTIONS.class);
	}

	@Generated
	protected CSSM_APPLE_TP_SMIME_OPTIONS(Pointer peer) {
		super(peer);
	}

	@Generated
	public CSSM_APPLE_TP_SMIME_OPTIONS(
			int Version,
			short IntendedUsage,
			int SenderEmailLen,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String SenderEmail) {
		super(CSSM_APPLE_TP_SMIME_OPTIONS.class);
		setVersion(Version);
		setIntendedUsage(IntendedUsage);
		setSenderEmailLen(SenderEmailLen);
		setSenderEmail(SenderEmail);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int Version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short IntendedUsage();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setIntendedUsage(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int SenderEmailLen();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSenderEmailLen(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String SenderEmail();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSenderEmail(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);
}
