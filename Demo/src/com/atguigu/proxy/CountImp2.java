package com.atguigu.proxy;

/*
 *  发现：重复代码很多且相似。所以代理就派上用场了。
 * 
 * 	每个方法都加的代码，叫做横切代码块（日志，验证，事务）
 * */

public class CountImp2 implements Count
{
	@Override
	public int add(int i, int j)
	{
		int returnValue = i + j;
		return returnValue;
	}

	@Override
	public int dem(int i, int j)
	{
		int returnValue = i + j;
		return returnValue;
	}

	@Override
	public void mul(int i, int j)
	{
		int returnValue = i * j;
		System.out.println("result="+returnValue);
	}

	@Override
	public void div(int i, int j)
	{
		int returnValue = i / j;
		System.out.println("result="+returnValue);
	}
}

