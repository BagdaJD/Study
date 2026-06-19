#include "pch.h"
#include "CppUnitTest.h"
#include "../Classes_Lab/point.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace TestClassesLab
{
	TEST_CLASS(TestClassesLab)
	{
	public:
		
		TEST_METHOD(TestGetSetXY)
		{
			Point p1(3, 4);
			Point p2(4, 5);

			Assert::AreEqual(3., p1.getX(), 1e-05);
			Assert::AreEqual(4., p1.getY(), 1e-05);

			p2.setX(6);
			p2.setY(7);

			Assert::AreEqual(6., p2.getX(), 1e-05);
			Assert::AreEqual(7., p2.getY(), 1e-05);
		}
		TEST_METHOD(TestEquals)
		{
			Point p1(3, 4);
			Point p2(4, 5);
			Point p3(3, 4);

			Assert::AreEqual(false, p1.isEqual(p2));
			Assert::AreEqual(true, p1.isEqual(p3));
		}
		TEST_METHOD(TestDistance)
		{
			Point p1(7, 4);
			Point p2(1, 1);
			Point p3(3, 3);

			Assert::AreEqual(2., p2.distance_to(p3), 1e-00);
			Assert::AreEqual(6., p1.distance_to(p2), 1e-00);
		}
	};
}
