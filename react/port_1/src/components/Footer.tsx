import React from 'react';
import { ArrowUp } from 'lucide-react';

export const Footer: React.FC = () => {
  const scrollToTop = () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
  };

  return (
    <footer className="border-t border-white/[0.08] bg-[#090a0e] py-12 text-xs text-zinc-500">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        <div className="flex flex-col md:flex-row items-center justify-between gap-6">
          
          {/* Brand & Copyright */}
          <div className="flex flex-col sm:flex-row items-center gap-3 text-center sm:text-left">
            <span className="font-bold text-zinc-300">Minjun Kim</span>
            <span aria-hidden="true" className="hidden sm:inline text-zinc-700">·</span>
            <span>Crafted with React 19, TypeScript & Tailwind CSS</span>
            <span aria-hidden="true" className="hidden sm:inline text-zinc-700">·</span>
            <span>© 2026. All rights reserved.</span>
          </div>

          {/* Time & Back to Top */}
          <div className="flex items-center gap-6">
            <div className="font-mono text-zinc-400">
              Seoul, KR (UTC+9)
            </div>
            
            <button
              onClick={scrollToTop}
              className="flex items-center gap-1 text-zinc-400 hover:text-white transition-colors"
              aria-label="맨 위로 이동"
            >
              <span>맨 위로</span>
              <ArrowUp className="h-3.5 w-3.5" />
            </button>
          </div>

        </div>
      </div>
    </footer>
  );
};
