package com.leading.valueanimatortest.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

/**
 * @package com.leading.valueanimatortest.customview
 * @fileName MyDrawTextView
 * @date 2018/11/30 15:16
 * @author Zj
 * @describe TODO
 * @org Leading.com(北京理正软件)
 * @email 2856211755@qq.com
 * @computer Administrator
 */
class MyDrawTextView(context: Context) : View(context) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
//        var baseLineX = 0f
//        var baseLineY = 200f
//        // 画基线
//        val mPaint = Paint()
//        mPaint.color = Color.RED
//        canvas.drawLine(baseLineX, baseLineY, 3000f, baseLineY, mPaint)

        // 1、drawText是中的参数y是基线的位置。
        //2、一定要清楚的是，只要x坐标、基线位置、文字大小确定以后，文字的位置就是确定的了。

        // 我们知道，我们在drawText(text, x, y, mPaint)中传进去的源点坐标(x,y);其中，y表示的基线的位置。那x代表什么呢？从上面的例子运行结果来看，应当是文字开始绘制的地方。
        //并不是！x代表所要绘制文字所在矩形的相对位置。相对位置就是指指定点（x,y）在在所要绘制矩形的位置。我们知道所绘制矩形的纵坐标是由Y值来确定的，而相对x坐标的位置，只有左、中、右三个位置了。也就是所绘制矩形可能是在x坐标的左侧绘制，也有可能在x坐标的中间，也有可能在x坐标的右侧。而定义在x坐标在所绘制矩形相对位置的函数是：
        // 写文字
//        mPaint.color = Color.GREEN
        // 已 px 为单位
//        mPaint.textSize = 120f
        // 加上paint.setTextAlign()来设置相对位置来看看结果
//        mPaint.textAlign = Paint.Align.LEFT // 原点(x,y)在矩形的左侧，即矩形从(x,y)的点开始绘制
//        mPaint.textAlign = Paint.Align.CENTER// 原点（x,y）就在所要绘制文字所在矩形区域的正中间，换句话说，系统会根据(x,y)的位置和文字所在矩形大小，会计算出当前开始绘制的点。以使原点(x,y)正好在所要绘制的矩形的正中间。
//        mPaint.textAlign = Paint.Align.RIGHT// 原点（x,y）应当在所要绘制矩形的右侧，在上面的代码中，也就是说正个矩形都在（0,200）的左侧，所以我们看到的是什么都没有。
//        canvas.drawText("drawText test", baseLineX, baseLineY, mPaint)
//        mPaint.textAlign = Paint.Align.CENTER
//        canvas.drawText("A", baseLineX, baseLineY, mPaint)
//        // 计算各线所在位置
//        val fontMetrics = mPaint.fontMetrics
//        val ascent = baseLineY + fontMetrics.ascent
//        val descent = baseLineY + fontMetrics.descent
//        val top = baseLineY + fontMetrics.top
//        val bottom = baseLineY + fontMetrics.bottom
//        // 画基线
//        mPaint.color = Color.RED
//        canvas.drawLine(baseLineX, baseLineY, 3000f, baseLineY, mPaint)
//        // 画ascent
//        mPaint.color = Color.BLUE
//        canvas.drawLine(baseLineX, ascent, 3000f, ascent, mPaint)
//        // 画descent
//        mPaint.color = Color.GREEN
//        canvas.drawLine(baseLineX, descent, 3000f, descent, mPaint)
//        // 画top
//        mPaint.color = Color.YELLOW
//        canvas.drawLine(baseLineX, top, 3000f, top, mPaint)
//        // 画bottom
//        mPaint.color = Color.CYAN
//        canvas.drawLine(baseLineX, bottom, 3000f, bottom, mPaint)

        // 所绘文字宽度、高度和最小矩形获取
        //这部分，我们将讲解如何获取所绘制字符串所占区域的高度、宽度和仅包裹字符串的最小矩形。我们来看张图来讲述下他们的意义
        // 字符串所占高度和宽度
        // 字符串所占高度很容易得到，直接用bottom线所在位置的Y坐标减去top线所在位置的Y坐标就是字符串所占的高度：
//        val fontMetricsInt = mPaint.fontMetricsInt
//        val top = baseLineY + fontMetricsInt.top
//        val bottom = baseLineY + fontMetricsInt.bottom
//        // 所占高度
//        val height = bottom - top
//        // 宽度
//        //宽度是非常容易得到的，直接利用下面的函数就可以得到
//        val width = mPaint.measureText("drawText test")
//
//        val string = "drawText test"
//        val minRect = Rect()
//        mPaint.getTextBounds(string, 0, string.length, minRect)
//        Log.e("zj", minRect.toShortString())

        val text = "文字绘制测试"
//        val baseLineX = 0
//        val baseLineY = 200
//
//        // 设置paint
//        val mPaint = Paint()
//        mPaint.textSize = 120f
//        mPaint.textAlign = Paint.Align.LEFT
//
//        // 画text所占的区域
//        val fontMetricsInt = mPaint.fontMetricsInt
//        val top = baseLineY + fontMetricsInt.top
//        val bottom = baseLineY + fontMetricsInt.bottom
//        val width = mPaint.measureText(text)
//        val rect = Rect(baseLineX, top, (baseLineX + width).toInt(), bottom)
//        mPaint.color = Color.GREEN
//        canvas.drawRect(rect, mPaint)
//
//        // 画最小矩形
//        val minRect = Rect()
//        mPaint.getTextBounds(text, 0, text.length, minRect)
//        minRect.top = minRect.top + baseLineY
//        minRect.bottom = minRect.bottom + baseLineY
//        mPaint.color = Color.RED
//        canvas.drawRect(minRect, mPaint)
//
//        // 写文字
//        mPaint.color = Color.BLACK
//        canvas.drawText(text, baseLineX.toFloat(), baseLineY.toFloat(), mPaint)

        // 定点写字
        //讲完上面的三部分，这篇文章所要讲的知识点基本就结束了，这部分其实就是应用的范畴了，在这部分中，我们将讲述，
        // 当我们设定一个点，如何到得基线位置，进而画出字符串。
        //1、给定左上顶点绘图
//        val top = 200f
        // 给定中间线的位置为200,然后计算出baseline的位置，然后把文字在baseline的基础上画出来。
        val center = 200f;
        val baseLineX = 0f

        // 设置paint
        val paint = Paint()
        paint.textSize = 120f
        paint.textAlign = Paint.Align.LEFT

//        // 已知top线计算baseLine，绘制文字
//        // 画top线
//        mPaint.color = Color.YELLOW
//        canvas.drawLine(baseLineX, top, 3000f, top, mPaint)
//
//        // 计算出baseLine位置
//        val fontMetricsInt = mPaint.fontMetricsInt
//        val baseLineY = top - fontMetricsInt.top

        // 画center线
        paint.color = Color.YELLOW
        canvas.drawLine(baseLineX, center, 3000f, center, paint)

        // 计算出baseLine的位置
        val fontMetricsInt = paint.fontMetricsInt
        val baseLineY = center + (fontMetricsInt.bottom - fontMetricsInt.top) / 2 - fontMetricsInt.bottom

        // 画基线
        paint.color = Color.RED
        canvas.drawLine(baseLineX, baseLineY, 3000f, baseLineY, paint)

        // 写文字
        paint.color = Color.GREEN
        canvas.drawText(text, baseLineX, baseLineY, paint)
    }
}