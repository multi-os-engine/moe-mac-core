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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Structure(alignment = 2)
public final class TokenBlock extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TokenBlock() {
		super(TokenBlock.class);
	}

	@Generated
	protected TokenBlock(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native BytePtr source();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSource(BytePtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long sourceLength();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSourceLength(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native BytePtr tokenList();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTokenList(BytePtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long tokenLength();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTokenLength(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long tokenCount();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setTokenCount(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native BytePtr stringList();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setStringList(BytePtr value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long stringLength();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setStringLength(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long stringCount();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setStringCount(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte doString();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setDoString(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte doAppend();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setDoAppend(byte value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native byte doAlphanumeric();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDoAlphanumeric(byte value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte doNest();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDoNest(byte value);

	@Generated
	@StructureField(order = 12, isGetter = true, count = 2)
	public native short leftDelims(int field_idx);

	@Generated
	@StructureField(order = 12, isGetter = false, count = 2)
	public native void setLeftDelims(short value, int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = true, count = 2)
	public native short rightDelims(int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = false, count = 2)
	public native void setRightDelims(short value, int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = true, count = 4)
	public native short leftComment(int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = false, count = 4)
	public native void setLeftComment(short value, int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = true, count = 4)
	public native short rightComment(int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = false, count = 4)
	public native void setRightComment(short value, int field_idx);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native short escapeCode();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setEscapeCode(short value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native short decimalCode();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setDecimalCode(short value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> itlResource();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setItlResource(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 19, isGetter = true, count = 8)
	public native long reserved(int field_idx);

	@Generated
	@StructureField(order = 19, isGetter = false, count = 8)
	public native void setReserved(long value, int field_idx);
}
